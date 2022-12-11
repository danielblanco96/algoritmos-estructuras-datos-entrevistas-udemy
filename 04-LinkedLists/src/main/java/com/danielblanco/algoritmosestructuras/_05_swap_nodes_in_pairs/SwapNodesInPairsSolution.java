package com.danielblanco.algoritmosestructuras._05_swap_nodes_in_pairs;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;

/*
 * Escribe un algoritmo que intercambie parejas de nodos adyacentes sin
 * modificar el valor interno de los nodos.
 *
 * Ejemplo:
 *  Input: 1->2->4->6->8
 *  Output: 2->1->6->4->8
 */
public class SwapNodesInPairsSolution {

  public Node swapNodesInPairs(Node head) {
    if (head == null || head.next == null) return head;

    Node remaining = head.next.next;
    head.next.next = head;
    head = head.next;
    head.next.next = swapNodesInPairs(remaining);
    return head;
  }
}
