package com.danielblanco.algoritmosestructuras.sorting._00_sorting;

public class SelectionSort {
  static void sort(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
      // En cada iteración seleccionamos el mínimo y lo movemos al inicio de la parte desordenada
      // del array.
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
