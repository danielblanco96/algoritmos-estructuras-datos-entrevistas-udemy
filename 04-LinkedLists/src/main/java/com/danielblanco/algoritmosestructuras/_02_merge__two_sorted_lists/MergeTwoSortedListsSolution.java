package com.danielblanco.algoritmosestructuras._02_merge__two_sorted_lists;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;

/*
 * Escribe un algoritmo para combinar dos listas enlazadas simples ordenadas.
 * El resultado debe ser una única lista enlazada ordenada. Devuelve su head.
 *
 * Ejemplo:
 *  Input: 1->2->4, 2->3->5
 *  Output: 1->2->2->3->4->5
 */
public class MergeTwoSortedListsSolution {

  public Node mergeTwoLists(Node list1, Node list2) {
    Node dummy = new Node(Integer.MIN_VALUE);

    // Se toman los nodos de forma ordenada hasta que se finalice una de las dos listas
    Node current = dummy;
    while (list1 != null && list2 != null) {
      if (list1.value <= list2.value) {
        current.next = list1;
        list1 = list1.next;
      } else {
        current.next = list2;
        list2 = list2.next;
      }

      current = current.next;
    }

    // Para acabar, se añaden los elementos de la lista que aún no hemos finalizado.
    if (list1 == null) {
      appendList(current, list2);
    } else {
      appendList(current, list1);
    }

    return dummy.next;
  }

  private void appendList(Node current, Node listToAppend) {
    while (listToAppend != null) {
      current.next = listToAppend;
      listToAppend = listToAppend.next;
      current = current.next;
    }
  }
}
