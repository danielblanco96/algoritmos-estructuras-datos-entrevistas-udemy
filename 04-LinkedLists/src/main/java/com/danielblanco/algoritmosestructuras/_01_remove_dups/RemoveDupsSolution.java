package com.danielblanco.algoritmosestructuras._01_remove_dups;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;
import java.util.HashSet;

/*
 * Escribe un algoritmo para eliminar los elementos duplicados en una Lista enlazada
 *
 * Ejemplo:
 *  Input: 1->2->2->3->4->1
 *  Output: 1->2->3->4
 *
 *
 *
 * Follow-up: ¿Cuál sería tu solución si no pudieras utilizar memoria adicional?
 */
public class RemoveDupsSolution {

  public void removeDups(Node head) {
    HashSet<Integer> foundValues = new HashSet<Integer>();
    Node previous = null;
    Node current = head;

    while (current != null) {
      if (foundValues.add(current.value)) {
        // Si es un valor que nunca hemos visto avanzamos una posición previous
        previous = current;
      } else {
        // En caso contrario, debemos eliminar ese nodo
        previous.next = current.next;
      }

      // Por último avanzamos el nodo actual
      current = current.next;
    }
  }
}
