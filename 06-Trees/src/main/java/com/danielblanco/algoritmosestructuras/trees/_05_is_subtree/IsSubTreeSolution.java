package com.danielblanco.algoritmosestructuras.trees._05_is_subtree;

import com.danielblanco.algoritmosestructuras.trees._00_binarytree.Node;

/*
 * Determina si el árbol second es subárbol del árbol first.
 *
 * Ejemplo 1:
 *  Input:
 *    first:
 *         4
 *      5     7
 *    1   3
 *  8
 *
 *    second:
 *         4
 *      2     7
 *    1   3  5
 *
 *  Output: false
 *
 * Ejemplo 2:
 *  Input:
 *    first:
 *         4
 *      5     7
 *    1   3
 *  8
 *
 *    second:
 *         5
 *      1     3
 *    8
 *
 *  Output: true
 */
public class IsSubTreeSolution {

  public boolean isSubtree(Node first, Node second) {
    StringBuilder stb1 = new StringBuilder();
    StringBuilder stb2 = new StringBuilder();

    preOrder(first, stb1);
    preOrder(second, stb2);

    return stb1.toString().contains(stb2.toString());
  }

  private void preOrder(Node node, StringBuilder stb) {
    if (node == null) {
      stb.append("X");
      return;
    }

    stb.append(node.value);
    preOrder(node.left, stb);
    preOrder(node.right, stb);
  }
}
