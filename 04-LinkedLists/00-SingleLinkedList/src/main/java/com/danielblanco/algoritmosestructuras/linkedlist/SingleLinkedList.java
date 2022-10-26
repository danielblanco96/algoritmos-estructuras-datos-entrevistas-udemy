package com.danielblanco.algoritmosestructuras.linkedlist;

public class SingleLinkedList {
  public Node head;

  public void appentToTail(int value) {
    if (head == null) {
      head = new Node(value);
      return;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = new Node(value);
  }

  public void deleteNode(int value) {
    if (head == null) return;

    if (head.value == value) {
      head = head.next;
      return;
    }

    Node n = head;
    while (n.next != null) {
      if (n.next.value == value) {
        n.next = n.next.next;
        return;
      }
      n = n.next;
    }
  }

  public void print() {
    if (head == null) {
      System.out.println("END");
      return;
    }
    Node current = head;
    while (current.next != null) {
      System.out.print(current.value + " -> ");
      current = current.next;
    }
    System.out.println(current.value + " -> END");
  }
}
