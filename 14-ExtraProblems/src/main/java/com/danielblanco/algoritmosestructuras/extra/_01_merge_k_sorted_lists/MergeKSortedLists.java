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
public class MergeKSortedLists {

  public class Node {
    public Node next;
    public int value;

    public Node(int value) {
      this.value = value;
    }
  }

  public Node mergeKLists(Node[] lists) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}
