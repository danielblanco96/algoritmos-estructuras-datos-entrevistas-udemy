package com.danielblanco.algoritmosestructuras.sorting;

public class SelectionSort {
  static void sort(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
      // In each iteration, select the minimum and place it at the beginning of the unsorted part of
      // the array
      int minIndex = findMinimumElementIndex(array, i);
      SearchUtils.swap(array, i, minIndex);
    }
  }

  private static int findMinimumElementIndex(int[] array, int start) {
    int minIndex = start;
    for (int i = start + 1; i < array.length; i++) {
      if (array[i] < array[minIndex]) minIndex = i;
    }

    return minIndex;
  }
}
