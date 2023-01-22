package com.danielblanco.algoritmosestructuras._00_stackqueue;

public class MyStack {
  private Node top;

  public void push(int value) {
    Node newTop = new Node(value);
    newTop.next = top;
    top = newTop;
  }

  public int pop() {
    if (top == null) {
      throw new MyEmptyStackException();
    }

    int topValue = top.value;
    top = top.next;
    return topValue;
  }

  public int peek() {
    if (top == null) {
      throw new MyEmptyStackException();
    }

    return top.value;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
