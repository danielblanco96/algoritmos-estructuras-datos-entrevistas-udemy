package com.danielblanco.algoritmosestructuras.sorting;

/* The pivot could be the first element of the list, the last, the middle or the median
 *
 * We divide the list in two lists recursively, one with the elements smaller than the pivot and other with the
 * bigger ones.
 *
 * O(n log(n)) average time and O(n^2) worst time because the pivot could be far from the median. If the selected
 * pivot is always the greatest or smallest number we are basically doing a bubble sort. */
public class QuickSort {

  public static void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private static void sort(int[] array, int left, int right) {
    int index = partition(array, left, right);
    if (left < index - 1) {
      sort(array, left, index - 1);
    }
    if (index < right) {
      sort(array, index, right);
    }
  }

  private static int partition(int[] array, int left, int right) {
    int pivot = array[left + (right - left) / 2];
    while (left <= right) {
      /* Find element on left that should be on right */
      while (array[left] < pivot) left++;

      /* Find element on right that should be on left */
      while (array[right] > pivot) right--;

      /* Swap elements, and swap left and right indexes */
      if (left <= right) {
        SearchUtils.swap(array, left, right);
        left++;
        right--;
      }
    }
    return left;
  }
}
