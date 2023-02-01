package com.danielblanco.algoritmosestructuras.extra._01_merge_k_sorted_lists;

/*
 * Dado un array de listas enlazadas, cada una de ellas ordenada de forma ascendente,
 * combínalas para devolver una única lista enlazada ordenada.
 *
 * Nota: No está permitido almacenar todos los valores de los nodos para ordenarlos de forma
 * separada y crear una nueva lista enlazada a partir de ese resultado.
 *
 * Ejemplo:
 *  Input:
 *    [
 *       1->4->5,
 *       1->3->4,
 *       2->6
 *    ]
 *   Output:
 *     1->1->2->3->4->4->5->6
 */
public class MergeKSortedListsSolution {

  public class Node {
    public Node next;
    public int value;

    public Node(int value) {
      this.value = value;
    }
  }

  public Node mergeKLists(Node[] lists) {
    if (lists == null || lists.length == 0) return null;

    int offset = 1;
    while (offset < lists.length) {
      for (int i = 0; (i + offset) < lists.length; i += offset * 2) {
        lists[i] = mergeTwoLists(lists[i], lists[i + offset]);
      }

      offset *= 2;
    }

    return lists[0];
  }

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
