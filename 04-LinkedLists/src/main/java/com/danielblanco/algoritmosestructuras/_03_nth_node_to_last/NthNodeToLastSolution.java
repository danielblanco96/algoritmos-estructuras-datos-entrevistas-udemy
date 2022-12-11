package com.danielblanco.algoritmosestructuras._03_nth_node_to_last;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;

/*
 * Dada una lista enlazada simple y un valor N, devuelve el nodo N empezando por el final
 *
 * Ejemplo:
 *  Input: 1->2->4->6, 1
 *  Output: 4
 */
public class NthNodeToLastSolution {

  // Utilizando dos punteros, si primero avanzamos n posiciones el primero, y a continuación
  // avanzamos ambos al mismo ritmo, cuando el primero llegue al final de la lista, el segundo
  // estará en la posición deseada.
  public Node nthNodeToLast(Node head, int n) {
    Node p1 = head;
    Node p2 = head;

    // Avanzamos n posiciones con el primer puntero
    for (int i = 0; i < n; i++) {
      if (p1 == null) {
        return null;
      }

      p1 = p1.next;
    }

    // Avanzamos ambos al mismo ritmo hasta que el puntero avanzado llegue al final
    while (p1 != null) {
      p1 = p1.next;
      p2 = p2.next;
    }

    return p2;
  }
}
