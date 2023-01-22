package com.danielblanco.algoritmosestructuras.trees._04_validate_bst;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.danielblanco.algoritmosestructuras.trees._00_binarytree.Node;
import org.junit.jupiter.api.Test;

public class ValidateBSTTest {

  @Test
  public void validateBstTest() {
    ValidateBST validateBst = new ValidateBST();
    Node root = new Node(4);
    root.left = new Node(5);
    root.right = new Node(7);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.left.left.left = new Node(8);

    assertFalse(validateBst.isValidBST(root));

    root.left.value = 2;
    root.left.left.left = null;
    assertTrue(validateBst.isValidBST(root));
  }
}
