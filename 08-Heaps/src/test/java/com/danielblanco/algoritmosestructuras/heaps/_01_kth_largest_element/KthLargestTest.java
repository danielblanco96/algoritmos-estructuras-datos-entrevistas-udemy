package com.danielblanco.algoritmosestructuras.heaps._01_kth_largest_element;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KthLargestTest {

  @Test
  public void kthSmallestElementTest() {
    KthLargest kthSmallest = new KthLargest(4, new int[] {1, 2, 3, 4, 5});

    assertEquals(3, kthSmallest.add(6));
    assertEquals(3, kthSmallest.add(2));
    assertEquals(3, kthSmallest.add(1));
    assertEquals(4, kthSmallest.add(8));
  }
}
