package com.danielblanco.algoritmosestructuras.trees._00_binarytree;

import org.junit.jupiter.api.Test;

/*
 *          1
 *      2       3
 *   4     5      6
 * 7     8
 */
public class BinaryTreeTraversalsTest {

  @Test
  public void test() {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    root.left.left = new Node(4);
    root.left.right = new Node(5);

    root.right.right = new Node(6);

    root.left.left.left = new Node(7);

    root.left.right.left = new Node(8);

    System.out.print("IN-ORDER TRAVERSAL: ");
    BinaryTreeTraversals.inOrderTraversal(root);
    System.out.println();

    System.out.print("PRE-ORDER TRAVERSAL: ");
    BinaryTreeTraversals.preOrderTraversal(root);
    System.out.println();

    System.out.print("POST-ORDER TRAVERSAL: ");
    BinaryTreeTraversals.postOrderTraversal(root);
    System.out.println();
  }
}
