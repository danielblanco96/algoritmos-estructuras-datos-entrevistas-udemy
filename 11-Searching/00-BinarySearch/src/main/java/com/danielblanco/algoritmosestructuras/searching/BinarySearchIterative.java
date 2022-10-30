package com.danielblanco.algoritmosestructuras.searching;

public class BinarySearchIterative {

  int binarySearch(int[] array, int target) {
    int index = -1;
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      int mid = left + ((right - left) / 2);
      if (array[mid] < target) {
        left = mid + 1;
      } else if (array[mid] > target) {
        right = mid - 1;
      } else if (array[mid] == target) {
        index = mid;
        break;
      }
    }

    return index;
  }
}
