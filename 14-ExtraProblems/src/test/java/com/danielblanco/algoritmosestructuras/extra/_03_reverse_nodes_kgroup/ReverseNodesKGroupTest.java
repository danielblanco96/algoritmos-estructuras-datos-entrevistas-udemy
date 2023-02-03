package com.danielblanco.algoritmosestructuras.extra._03_reverse_nodes_kgroup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.danielblanco.algoritmosestructuras.extra._03_reverse_nodes_kgroup.ReverseNodesKGroup.ListNode;
import org.junit.jupiter.api.Test;

public class ReverseNodesKGroupTest {

  @Test
  public void reverseNodesKGroupTest() {
    ReverseNodesKGroup reverse = new ReverseNodesKGroup();

    ListNode node = reverse.new ListNode(1);
    node.next = reverse.new ListNode(2);
    node.next.next = reverse.new ListNode(3);
    node.next.next.next = reverse.new ListNode(4);
    node.next.next.next.next = reverse.new ListNode(5);
    node.next.next.next.next.next = reverse.new ListNode(6);
    node.next.next.next.next.next.next = reverse.new ListNode(7);

    ListNode newHead = reverse.reverseKGroup(node, 4);

    assertEquals(4, newHead.val);
    assertEquals(3, newHead.next.val);
    assertEquals(2, newHead.next.next.val);
    assertEquals(1, newHead.next.next.next.val);
    assertEquals(5, newHead.next.next.next.next.val);
    assertEquals(6, newHead.next.next.next.next.next.val);
    assertEquals(7, newHead.next.next.next.next.next.next.val);
  }
}
