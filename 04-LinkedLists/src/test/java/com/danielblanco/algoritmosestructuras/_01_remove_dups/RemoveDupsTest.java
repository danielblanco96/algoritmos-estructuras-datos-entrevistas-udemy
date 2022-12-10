package com.danielblanco.algoritmosestructuras._01_remove_dups;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;
import org.junit.jupiter.api.Test;

public class RemoveDupsTest {

  @Test
  public void removeDupsTest() {
    RemoveDups removeDups = new RemoveDups();
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(2);
    head.next.next.next = new Node(3);
    head.next.next.next.next = new Node(4);
    head.next.next.next.next.next = new Node(1);

    removeDups.removeDups(head);

    assertEquals(1, head.value);
    assertEquals(2, head.next.value);
    assertEquals(3, head.next.next.value);
    assertEquals(4, head.next.next.next.value);
    assertEquals(null, head.next.next.next.next);
  }
}
