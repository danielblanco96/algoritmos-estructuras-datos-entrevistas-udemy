package com.danielblanco.algoritmosestructuras._00_stackqueue;

public class MyQueue {
  private Node first;
  private Node last;

  public void add(int value) {
    Node newLast = new Node(value);
    if (last != null) {
      last.next = newLast;
    }

    last = newLast;

    if (first == null) {
      first = last;
    }
  }

  public int remove() {
    if (first == null) {
      throw new MyEmptyQueueException();
    }

    int firstValue = first.value;
    first = first.next;

    if (first == null) {
      last = null;
    }

    return firstValue;
  }

  public int peek() {
    if (first == null) {
      throw new MyEmptyQueueException();
    }

    return first.value;
  }

  public boolean isEmpty() {
    return first == null;
  }
}
