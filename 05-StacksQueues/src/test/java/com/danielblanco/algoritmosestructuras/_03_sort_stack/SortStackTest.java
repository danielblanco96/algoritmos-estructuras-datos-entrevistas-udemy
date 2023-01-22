package com.danielblanco.algoritmosestructuras._03_sort_stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Deque;
import org.junit.jupiter.api.Test;

public class SortStackTest {

  @Test
  public void sortStackTest() {
    SortStack sortStack = new SortStack();

    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(1);
    stack.push(5);
    stack.push(2);
    stack.push(4);
    Deque<Integer> sortedStack = sortStack.sort(stack);

    assertEquals(1, sortedStack.pop());
    assertEquals(2, sortedStack.pop());
    assertEquals(4, sortedStack.pop());
    assertEquals(5, sortedStack.pop());
  }
}
