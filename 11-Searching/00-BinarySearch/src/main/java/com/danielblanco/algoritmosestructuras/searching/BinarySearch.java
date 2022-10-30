package com.danielblanco.algoritmosestructuras.searching;

public class BinarySearch {

  int binarySearch(int[] array, int target) {
    return binarySearch(array, 0, array.length - 1, target);
  }

  private int binarySearch(int[] array, int left, int right, int target) {
    if (right >= left) {
      int mid = left + (right - left) / 2;

      // Element present in the middle of the array
      if (array[mid] == target) return mid;

      // If element is smaller than middle element, it has to be in the left side
      if (array[mid] > target) return binarySearch(array, left, mid - 1, target);

      // Else the element can only be present in the right subarray
      return binarySearch(array, mid + 1, right, target);
    }

    // Element not present in array
    return -1;
  }
}
