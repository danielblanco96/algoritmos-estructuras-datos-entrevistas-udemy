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
    Node current = dummy;

    // Mientras haya alguna lista con valores
    while(list1 != null || list2 != null){
        // Si list1 es null tomar valores de la list2
        if (list1 == null){
            current.next = list2;
            list2 = list2.next;
          
        // Si la list22 esta vacia o el valor de list1 es menor, usar lista1
        } else if (list2 == null || list1.val <= list2.val){
            current.next = list1;
            list1 = list1.next;
          
        // valor en list2 es menor, usar list2
        } else {
            current.next = list2;
            list2 = list2.next;
        }
        current = current.next;
    }
    
    return dummy.next;   
  }

}
