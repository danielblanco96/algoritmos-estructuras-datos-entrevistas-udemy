package com.danielblanco.algoritmosestructuras._04_add_two_numbers;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;

/*
 * Escribe un algoritmo que realice la suma de dos listas que representan
 * dos enteros positivos. Las listas están en posición invertida.
 *
 * Ejemplo:
 *  Input: 1->2->4, 5->2->8
 *  Output: 6->4->2->1
 *  6421 + 825 = 7246
 */
public class AddTwoNumbers {

  public Node addTwoNumbers(Node list1, Node list2) {
    Node result = new Node(-1);
    Node current = result;
    int carry = 0;

    while (list1 != null || list2 != null) {
      current.next = new Node(-1);
      current = current.next;
      int digit = carry;

      if (list1 != null) {
        digit += list1.value;
        list1 = list1.next;
      }

      if (list2 != null) {
        digit += list2.value;
        list2 = list2.next;
      }

      carry = digit / 10;
      digit = digit % 10;

      current.value = digit;
    }

    if (carry > 0) {
      current.next = new Node(carry);
    }

    return result.next;
  }
}
