package com.danielblanco.algoritmosestructuras.sorting._00_sorting;

public class BubbleSort {
  static void sort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          SearchUtils.swap(array, j, j + 1);
        }
      }
    }
  }
}
