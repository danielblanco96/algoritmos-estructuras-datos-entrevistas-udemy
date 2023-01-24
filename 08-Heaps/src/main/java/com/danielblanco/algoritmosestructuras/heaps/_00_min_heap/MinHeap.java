package com.danielblanco.algoritmosestructuras.heaps._00_min_heap;

import java.util.Arrays;

public class MinHeap {
  private int[] Heap;
  private int size;
  private int maxSize;

  public MinHeap(int size) {
    this.maxSize = size;
    this.size = 0;
    Heap = new int[size];
  }

  private int parentIndex(int i) {
    return (i - 1) / 2;
  }

  private int leftChildIndex(int i) {
    return (i * 2) + 1;
  }

  private int rightChildIndex(int i) {
    return (i * 2) + 2;
  }

  private boolean isLeaf(int i) {
    if (rightChildIndex(i) >= size && leftChildIndex(i) >= size) {
      return true;
    }
    return false;
  }

  public void insert(int element) {
    if (size >= maxSize) {
      return;
    }
    Heap[size] = element;
    int current = size;

    while (Heap[current] < Heap[parentIndex(current)]) {
      swap(current, parentIndex(current));
      current = parentIndex(current);
    }
    size++;
  }

  public int extractMin() {
    if (size <= 0) return Integer.MIN_VALUE;

    int popped = Heap[0];
    Heap[0] = Heap[--size];
    minHeapify(0);
    return popped;
  }

  private void minHeapify(int i) {
    if (!isLeaf(i)) {
      if (Heap[i] > Heap[leftChildIndex(i)] || Heap[i] > Heap[rightChildIndex(i)]) {
        if (Heap[leftChildIndex(i)] < Heap[rightChildIndex(i)]) {
          swap(i, leftChildIndex(i));
          minHeapify(leftChildIndex(i));
        } else {
          swap(i, rightChildIndex(i));
          minHeapify(rightChildIndex(i));
        }
      }
    }
  }

  public void printHeapPretty() {
    for (int i = 0; i < (size / 2); i++) {
      System.out.print("Parent : " + Heap[i]);
      if (leftChildIndex(i) < size) System.out.print(" Left : " + Heap[leftChildIndex(i)]);
      if (rightChildIndex(i) < size) System.out.print(" Right :" + Heap[rightChildIndex(i)]);
      System.out.println();
    }
  }

  public void printHeap() {
    System.out.println(Arrays.toString(Heap));
  }

  private void swap(int x, int y) {
    int tmp;
    tmp = Heap[x];
    Heap[x] = Heap[y];
    Heap[y] = tmp;
  }
}
