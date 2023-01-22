package com.danielblanco.algoritmosestructuras.trees._01_invert_binary_tree;

import com.danielblanco.algoritmosestructuras.trees._00_binarytree.Node;

/*
 * Dada la raíz de un árbol binario, devuelve el árbol binario invertido.
 *
 * Ejemplo:
 *  Input:
 *        4
 *     2     7
 *   1   3  6  9
 *
 *  *  Output:
 *        4
 *     7     2
 *   9   6  3  1
 */
public class InvertBinaryTreeSolution {

  public Node invertTree(Node root) {
    if (root == null) return null;

    Node tmp = root.left;
    root.left = invertTree(root.right);
    root.right = invertTree(tmp);

    return root;
  }
}
