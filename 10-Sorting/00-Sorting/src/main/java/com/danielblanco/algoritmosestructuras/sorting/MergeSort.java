package com.danielblanco.algoritmosestructuras.sorting;

public class MergeSort {

  public static void sort(int[] array) {
    int[] helper = new int[array.length];
    sort(array, helper, 0, array.length - 1);
  }

  private static void sort(int[] array, int[] helper, int low, int high) {
    if (low < high) {
      int middle = (low + high) / 2;
      sort(array, helper, low, middle); // Sort left side
      sort(array, helper, middle + 1, high); // Sort right side
      merge(array, helper, low, middle, high); // Merge both
    }
  }

  private static void merge(int[] array, int[] helper, int low, int middle, int high) {
    /* Copy both halves into the helper array */
    for (int i = low; i <= high; i++) {
      helper[i] = array[i];
    }

    int helperLeft = low;
    int helperRight = middle + 1;
    int current = low;

    /* Iterate through helper array. Compare left and right half, copying back the smaller element from
     * the two halves into the original array. */
    while (helperLeft <= middle && helperRight <= high) {
      if (helper[helperLeft] <= helper[helperRight]) {
        array[current] = helper[helperLeft];
        helperLeft++;
      } else {
        array[current] = helper[helperRight];
        helperRight++;
      }
      current++;
    }

    /* Copy the rest of the left side of the array into the target array
     * The right elements aren't copied because they are already in the array. For example
     * 3 5 14 || 2 4 6. We copy to the array the 2, 3, 4, 5 and 6, so we need to copy the rest of the left (14)
     * Other: 2 4 6 || 3 5 14. We copy 2, 3, 4, 5 and 6, but the 14 is already in that position in the array.
     * The helper array is a copy of the array, so we don't need to copy that part!
     *  */
    int remaining = middle - helperLeft;
    for (int i = 0; i <= remaining; i++) {
      array[current + i] = helper[helperLeft + i];
    }
  }
}
