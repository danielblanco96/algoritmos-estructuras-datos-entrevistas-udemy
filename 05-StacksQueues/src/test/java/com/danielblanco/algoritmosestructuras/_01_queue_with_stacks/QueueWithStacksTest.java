package com.danielblanco.algoritmosestructuras._01_queue_with_stacks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class QueueWithStacksTest {

  @Test
  public void queueWithStacksTest() {
    QueueWithStacks queueWithStacks = new QueueWithStacks();

    assertEquals(0, queueWithStacks.size());
    queueWithStacks.add(1);
    queueWithStacks.add(2);
    queueWithStacks.add(3);
    assertEquals(1, queueWithStacks.remove());
    assertEquals(2, queueWithStacks.peek());
    assertEquals(2, queueWithStacks.size());
    queueWithStacks.add(4);
    assertFalse(queueWithStacks.isEmpty());
    assertEquals(2, queueWithStacks.remove());
    assertEquals(3, queueWithStacks.remove());
    assertEquals(4, queueWithStacks.remove());
    assertTrue(queueWithStacks.isEmpty());
  }
}
