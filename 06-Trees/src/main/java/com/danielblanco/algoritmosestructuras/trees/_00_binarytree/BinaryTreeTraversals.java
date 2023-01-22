package com.danielblanco.algoritmosestructuras.trees._00_binarytree;
;

public class BinaryTreeTraversals {
  public static void inOrderTraversal(Node node) {
    if (node != null) {
      inOrderTraversal(node.left);
      System.out.print(node.value + " ");
      inOrderTraversal(node.right);
    }
  }

  public static void preOrderTraversal(Node node) {
    if (node != null) {
      System.out.print(node.value + " ");
      preOrderTraversal(node.left);
      preOrderTraversal(node.right);
    }
  }

  public static void postOrderTraversal(Node node) {
    if (node != null) {
      postOrderTraversal(node.left);
      postOrderTraversal(node.right);
      System.out.print(node.value + " ");
    }
  }
}
