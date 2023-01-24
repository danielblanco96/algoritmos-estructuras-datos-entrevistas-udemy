package com.danielblanco.algoritmosestructuras.searching._00_binary_search;

public class BinarySearchIterative {

  int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      int mid = left + ((right - left) / 2);

      if (array[mid] == target) return mid;

      if (array[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }
}
