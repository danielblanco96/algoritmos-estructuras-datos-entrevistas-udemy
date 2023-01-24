package com.danielblanco.algoritmosestructuras.trees._06_first_common_ancestor;

import com.danielblanco.algoritmosestructuras.trees._00_binarytree.Node;

/*
 * Devuelve el primer ancestro común de dos nodos.
 *
 * Ejemplo:
 *  Input:
 *         4
 *      5     7
 *    1   3
 *  8
 *
 *  firstCommonAncestor(1, 7) = 4
 *  firstCommonAncestor(1, 4) = null
 *  firstCommonAncestor(1, 3) = 5
 *
 */
public class FirstCommonAncestorSolution {

  class AncestorNode {
    boolean nodeFound;
    Node ancestor;
  }

  public Node firstCommonAncestor(Node root, Node firstNode, Node secondNode) {
    return postOrderSearch(root, firstNode, secondNode).ancestor;
  }

  private AncestorNode postOrderSearch(Node current, Node firstNode, Node secondNode) {
    if (current == null) {
      return new AncestorNode();
    }

    AncestorNode leftResult = postOrderSearch(current.left, firstNode, secondNode);
    if (leftResult.ancestor != null) return leftResult;

    AncestorNode rightResult = postOrderSearch(current.right, firstNode, secondNode);
    if (rightResult.ancestor != null) return rightResult;

    AncestorNode result = new AncestorNode();

    if (leftResult.nodeFound && rightResult.nodeFound) {
      result.ancestor = current;
      return result;
    }

    result.nodeFound =
        current == firstNode
            || current == secondNode
            || leftResult.nodeFound
            || rightResult.nodeFound;

    return result;
  }
}
