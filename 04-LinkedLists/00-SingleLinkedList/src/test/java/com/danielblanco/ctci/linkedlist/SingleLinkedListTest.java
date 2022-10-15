package com.danielblanco.ctci.linkedlist;

import org.junit.jupiter.api.Test;

import com.danielblanco.algoritmosestructuras.linkedlist.SingleLinkedList;

public class SingleLinkedListTest {

	@Test
	public void test() {
		SingleLinkedList list = new SingleLinkedList();
		list.print();
		list.appentToTail(1);
		list.appentToTail(2);
		list.appentToTail(3);
		list.print();
		list.appentToTail(4);
		list.appentToTail(5);
		list.print();
		list.deleteNode(1);
		list.print();

		list.deleteNode(3);
		list.print();

		list.deleteNode(5);
		list.print();
	}
}
