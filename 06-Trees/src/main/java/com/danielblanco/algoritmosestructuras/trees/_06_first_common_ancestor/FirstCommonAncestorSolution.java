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

  private AncestorNode postOrderSearch(Node currentNode, Node firstNode, Node secondNode) {
    if (currentNode == null) {
      return new AncestorNode();
    }

    AncestorNode leftResult = postOrderSearch(currentNode.left, firstNode, secondNode);
    if (leftResult.ancestor != null) {
      return leftResult;
    }
    AncestorNode rightResult = postOrderSearch(currentNode.right, firstNode, secondNode);
    if (rightResult.ancestor != null) {
      return leftResult;
    }

    AncestorNode result = new AncestorNode();
    result.nodeFound = leftResult.nodeFound || rightResult.nodeFound;

    if (leftResult.nodeFound && rightResult != null && rightResult.nodeFound) {
      result.ancestor = currentNode;
    }

    if (currentNode == firstNode || currentNode == secondNode) {
      result.nodeFound = true;
    }
    return result;
  }
}
