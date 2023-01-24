package com.danielblanco.algoritmosestructuras.heaps._00_min_heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinHeapTest {

  @Test
  public void test() {
    MinHeap minHeap = new MinHeap(20);
    minHeap.insert(5);
    minHeap.insert(10);
    minHeap.insert(12);
    minHeap.printHeap();
    minHeap.insert(3);
    minHeap.printHeap();
    minHeap.insert(9);
    minHeap.insert(15);
    minHeap.insert(1);
    minHeap.printHeap();

    assertEquals(1, minHeap.extractMin());
    assertEquals(3, minHeap.extractMin());
    assertEquals(5, minHeap.extractMin());
    assertEquals(9, minHeap.extractMin());
    assertEquals(10, minHeap.extractMin());
    assertEquals(12, minHeap.extractMin());
    assertEquals(15, minHeap.extractMin());
  }
}
