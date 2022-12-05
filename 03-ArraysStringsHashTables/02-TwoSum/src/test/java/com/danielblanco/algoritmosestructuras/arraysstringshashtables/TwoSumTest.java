package com.danielblanco.algoritmosestructuras.arraysstringshashtables;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

  @Test
  public void isUniqueTest() {
    int[] array = new int[] {9, 2, 5, 6};
    TwoSum twoSum = new TwoSum();
    assertArrayEquals(new int[] {1, 2}, twoSum.twoSum(array, 7));
    assertArrayEquals(null, twoSum.twoSum(array, 50));
  }
}
