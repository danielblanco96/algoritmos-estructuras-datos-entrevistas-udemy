package com.danielblanco.algoritmosestructuras.trees._04_validate_bst;

import com.danielblanco.algoritmosestructuras.trees._00_binarytree.Node;

/*
 * Determina si un árbol binario es un árbol binario de búsqueda válido:
 *  - El subárbol izquierdo de un nodo contiene solamente nodos <= que él.
 *  - El subárbol derecho de un nodo contiene solamente nodos > que él.
 *  - Ambos subárboles deben ser a su vez árboles binarios de búsqueda.
 *
 * Ejemplo 1:
 *  Input:
 *         4
 *      5     7
 *    1   3
 *  8
 *
 *  Output: false
 *
 * Ejemplo 2:
 *  Input:
 *         4
 *      2     7
 *    1   3  5
 *
 *  Output: true
 */
public class ValidateBSTSolution {
  public boolean isValidBST(Node root) {
    return isValidBST(root, null, null);
  }

  public boolean isValidBST(Node root, Integer min, Integer max) {
    if (root == null) return true;
    if ((min != null && root.value <= min) || (max != null && root.value >= max)) return false;

    return isValidBST(root.left, min, root.value) && isValidBST(root.right, root.value, max);
  }
}
