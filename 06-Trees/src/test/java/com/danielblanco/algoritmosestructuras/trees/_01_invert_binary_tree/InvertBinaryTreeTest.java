package com.danielblanco.algoritmosestructuras.trees._01_invert_binary_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.danielblanco.algoritmosestructuras.trees._00_binarytree.Node;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

  @Test
  public void invertBinaryTreeTest() {
    InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
    Node root = new Node(4);
    root.left = new Node(2);
    root.right = new Node(7);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.right.left = new Node(6);
    root.right.right = new Node(9);

    Node newRoot = invertBinaryTree.invertTree(root);
    assertEquals(4, newRoot.value);
    assertEquals(7, newRoot.left.value);
    assertEquals(2, newRoot.right.value);
    assertEquals(9, newRoot.left.left.value);
    assertEquals(6, newRoot.left.right.value);
    assertEquals(3, newRoot.right.left.value);
    assertEquals(1, newRoot.right.right.value);
  }
}
