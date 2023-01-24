package com.danielblanco.algoritmosestructuras.trees._06_first_common_ancestor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.danielblanco.algoritmosestructuras.trees._00_binarytree.Node;
import org.junit.jupiter.api.Test;

public class FirstCommonAncestorTest {

  @Test
  public void firstCommonAncestorTest() {
    FirstCommonAncestor fca = new FirstCommonAncestor();
    Node root = new Node(4);
    root.left = new Node(5);
    root.right = new Node(7);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.left.left.left = new Node(8);

    assertEquals(4, fca.firstCommonAncestor(root, root.left.left.left, root.right).value);
    assertEquals(5, fca.firstCommonAncestor(root, root.left.left, root.left.right).value);
    assertNull(fca.firstCommonAncestor(root, root, root.right));
  }
}
