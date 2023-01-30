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
public class BinaryTreeMaxPathSumSolution {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }
  }

  private int max = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root) {
    maxPathSumHelper(root);
    return max;
  }

  private int maxPathSumHelper(TreeNode root) {
    if (root == null) return 0;

    int left = Math.max(maxPathSumHelper(root.left), 0);
    int right = Math.max(maxPathSumHelper(root.right), 0);

    max = Math.max(max, root.val + left + right);

    return root.val + Math.max(left, right);
  }
}
