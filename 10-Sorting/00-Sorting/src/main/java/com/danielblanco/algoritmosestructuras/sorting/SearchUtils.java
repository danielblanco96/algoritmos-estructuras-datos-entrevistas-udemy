package com.danielblanco.algoritmosestructuras.sorting;

public class SearchUtils {
  static void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }
}
