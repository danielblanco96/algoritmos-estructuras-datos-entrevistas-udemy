package com.danielblanco.algoritmosestructuras.sorting;

/*
 * We divide the list in two lists recursively, one with the elements smaller than the pivot and other with the
 * bigger ones.
 *
 * O(n log(n)) average time and O(n^2) worst time because the pivot could be far from the median. If the selected
 * pivot is always the greatest or smallest number we are basically doing a bubble sort. */
public class QuickSort {

  public static void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private static void sort(int[] array, int low, int high) {
    if (low < high) {
      // partitioning index, arr[p] is now at right place
      int index = partition(array, low, high);

      // Separately sort elements before partition and after partition
      sort(array, low, index - 1);
      sort(array, index + 1, high);
    }
  }

  /* This function takes last element as pivot, places
  the pivot element at its correct position in sorted
  array, and places all smaller (smaller than pivot) to
  left of pivot and all greater elements to right of pivot */
  private static int partition(int[] array, int low, int high) {
    int pivot = array[high];

    // Index of smaller element and indicates
    // the right position of pivot found so far
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {
      if (array[j] < pivot) {
        // Increment index of smaller element
        // if current element is smaller than pivot
        i++;
        SearchUtils.swap(array, i, j);
      }
    }

    // Swap pivot to correct place
    SearchUtils.swap(array, i + 1, high);
    return i + 1;
  }
}
