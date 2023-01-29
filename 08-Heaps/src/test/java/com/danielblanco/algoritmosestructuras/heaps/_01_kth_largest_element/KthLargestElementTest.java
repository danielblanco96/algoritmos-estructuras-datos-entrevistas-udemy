package com.danielblanco.algoritmosestructuras.heaps._01_kth_largest_element;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KthLargestElementTest {

  @Test
  public void kthSmallestElementTest() {
    KthLargestElement kthSmallestElement = new KthLargestElement(4, new int[] {1, 2, 3, 4, 5});

    assertEquals(3, kthSmallestElement.add(6));
    assertEquals(3, kthSmallestElement.add(2));
    assertEquals(3, kthSmallestElement.add(1));
    assertEquals(4, kthSmallestElement.add(8));
  }
}
