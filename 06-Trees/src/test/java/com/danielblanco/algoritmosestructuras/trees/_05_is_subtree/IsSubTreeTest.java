package com.danielblanco.algoritmosestructuras.trees._05_is_subtree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.danielblanco.algoritmosestructuras.trees._00_binarytree.Node;
import org.junit.jupiter.api.Test;

public class IsSubTreeTest {

  @Test
  public void isSubTreeTest() {
    IsSubTree isSubTree = new IsSubTree();
    Node first = new Node(4);
    first.left = new Node(5);
    first.right = new Node(7);
    first.left.left = new Node(1);
    first.left.right = new Node(3);
    first.left.left.left = new Node(8);

    Node second = new Node(5);
    second.left = new Node(1);
    second.right = new Node(3);
    second.left.left = new Node(8);
    assertTrue(isSubTree.isSubtree(first, second));

    second.right.right = new Node(12);
    assertFalse(isSubTree.isSubtree(first, second));
  }
}
