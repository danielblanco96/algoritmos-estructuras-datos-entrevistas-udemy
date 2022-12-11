package com.danielblanco.algoritmosestructuras._02_merge__two_sorted_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

  @Test
  public void mergeTwoSortedListsTest() {
    MergeTwoSortedLists merge = new MergeTwoSortedLists();
    Node list1 = new Node(1);
    list1.next = new Node(2);
    list1.next.next = new Node(4);
    list1.next.next.next = new Node(6);

    Node list2 = new Node(2);
    list2.next = new Node(3);
    list2.next.next = new Node(5);

    Node result = merge.mergeTwoLists(list1, list2);
    assertEquals(1, result.value);
    assertEquals(2, result.next.value);
    assertEquals(2, result.next.next.value);
    assertEquals(3, result.next.next.next.value);
    assertEquals(4, result.next.next.next.next.value);
    assertEquals(5, result.next.next.next.next.next.value);
    assertEquals(6, result.next.next.next.next.next.next.value);
  }
}
