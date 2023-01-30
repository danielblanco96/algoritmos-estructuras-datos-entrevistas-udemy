package com.danielblanco.algoritmosestructuras.dp._05_binary_tree_max_path_sum;

/*
 * Dado un árbol binario, devuelve el camino con mayor suma acumulada.
 *
 * Nota: Un camino en un árbol es una secuencia de nodos conectados en la que el
 * mismo nodo no puede aparecer dos veces. El camino no tiene por qué pasar por la
 * raíz.
 *
 * Ejemplo 1:
 *  Input:
 *        2
 *     1     3
 *  -5     -1
 *
 *  Output:
 *    6 (path 1-2-3)
 *
 * Ejemplo 2:
 *  Input:
 *       -12
 *     5     3
 *         1   4
 *
 *  Output:
 *    8 (path 1-3-4)
 *
 */
public class BinaryTreeMaxPathSum {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }
  }

  public int maxPathSum(TreeNode root) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}
