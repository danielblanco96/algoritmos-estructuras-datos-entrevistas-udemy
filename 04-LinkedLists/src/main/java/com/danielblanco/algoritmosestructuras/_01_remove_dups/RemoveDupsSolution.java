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
    foundValues.add(head.value);
    Node current = head;

    while (current != null && current.next != null) {
      if (!foundValues.add(current.next.value)) {
        // Si ya hemos encontrado ese nodo debemos eliminarlo
        current.next = current.next.next;
      }

      // Por último avanzamos el nodo actual para seguir iterando sobre la lista
      current = current.next;
    }
  }
}
