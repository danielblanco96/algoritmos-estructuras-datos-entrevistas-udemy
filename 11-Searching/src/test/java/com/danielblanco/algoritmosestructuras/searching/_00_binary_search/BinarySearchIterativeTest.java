package com.danielblanco.algoritmosestructuras.searching._00_binary_search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchIterativeTest {

  @Test
  public void test() {
    BinarySearchIterative binarySearchIterative = new BinarySearchIterative();
    int[] array = new int[] {1, 3, 4, 7, 8, 9, 12, 15, 24, 35, 95};

    assertEquals(0, binarySearchIterative.binarySearch(array, 1));
    assertEquals(2, binarySearchIterative.binarySearch(array, 4));
    assertEquals(6, binarySearchIterative.binarySearch(array, 12));
    assertEquals(10, binarySearchIterative.binarySearch(array, 95));

    assertEquals(-1, binarySearchIterative.binarySearch(array, 0));
    assertEquals(-1, binarySearchIterative.binarySearch(array, 6));
    assertEquals(-1, binarySearchIterative.binarySearch(array, 13));
    assertEquals(-1, binarySearchIterative.binarySearch(array, 100));
  }
}
