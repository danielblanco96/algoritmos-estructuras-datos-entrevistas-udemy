package com.danielblanco.algoritmosestructuras.searching._00_binary_search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

  @Test
  public void test() {
    BinarySearch binarySearch = new BinarySearch();
    int[] array = new int[] {1, 3, 4, 7, 8, 9, 12, 15, 24, 35, 95};

    assertEquals(0, binarySearch.binarySearch(array, 1));
    assertEquals(2, binarySearch.binarySearch(array, 4));
    assertEquals(6, binarySearch.binarySearch(array, 12));
    assertEquals(10, binarySearch.binarySearch(array, 95));

    assertEquals(-1, binarySearch.binarySearch(array, 0));
    assertEquals(-1, binarySearch.binarySearch(array, 6));
    assertEquals(-1, binarySearch.binarySearch(array, 13));
    assertEquals(-1, binarySearch.binarySearch(array, 100));
  }
}
