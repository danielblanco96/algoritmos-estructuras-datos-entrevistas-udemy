package com.danielblanco.algoritmosestructuras.extra._03_reverse_nodes_kgroup;

/*
 * Dada una lista enlazada, inviértela de k en k nodos.
 *
 * Ejemplo 1:
 *  Input:
 *    head: 1->2->3->4->5->6->7
 *    k: 3
 *  Output: 3->2->1->6->5->4->7
 *
 * Ejemplo 2:
 *  Input:
 *    head: 1->2->3->4->5->6->7
 *    k: 4
 *  Output: 4->3->2->1->5->6->7
 */
public class ReverseNodesKGroupSolution {

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null) return null;

    ListNode root = new ListNode(-1);
    root.next = head;
    ListNode current = head;
    ListNode prev = root;

    while (current != null) {
      ListNode tail = current;
      int nodesToAdvance = k;

      while (current != null && nodesToAdvance-- > 0) {
        current = current.next;
      }

      if (nodesToAdvance > 0) {
        prev.next = tail;
      } else {
        prev.next = reverse(tail, k);
        prev = tail;
      }
    }

    return root.next;
  }

  private ListNode reverse(ListNode head, int k) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next = null;

    while (current != null && k-- > 0) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    head = prev;
    return head;
  }
}
