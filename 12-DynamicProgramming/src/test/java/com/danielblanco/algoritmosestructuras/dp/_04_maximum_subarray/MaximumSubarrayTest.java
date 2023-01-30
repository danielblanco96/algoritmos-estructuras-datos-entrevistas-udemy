package com.danielblanco.algoritmosestructuras.dp._04_maximum_subarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

  @Test
  public void maximumSubarrayTest() {
    MaximumSubarray max = new MaximumSubarray();
    assertEquals(6, max.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    assertEquals(23, max.maxSubArray(new int[] {5, 4, -1, 7, 8}));
  }
}
