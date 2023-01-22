package com.danielblanco.algoritmosestructuras.trees._02_list_of_depths;

import com.danielblanco.algoritmosestructuras.trees._00_binarytree.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Implementa un algoritmo que devuelva una lista enlazada con los nodos de cada nivel. Si el árbol tiene
 * N niveles debes devolver N listas enlazadas.
 *
 * Ejemplo:
 *  Input:
 *        4
 *     2     7
 *   1   3  6  9
 *
 *  Output:
 *    4
 *    2->7
 *    1->3->6->9
 */
public class ListOfDepthsSolution {
  public List<LinkedList<Node>> listOfDepths(Node root) {
    if (root == null) {
      return null;
    }

    List<LinkedList<Node>> result = new ArrayList<>();

    LinkedList<Node> current = new LinkedList<>();
    current.add(root);

    while (!current.isEmpty()) {
      result.add(current);
      LinkedList<Node> parents = current;
      current = new LinkedList<Node>();

      for (Node node : parents) {
        if (node.left != null) {
          current.add(node.left);
        }

        if (node.right != null) {
          current.add(node.right);
        }
      }
    }
    return result;
  }
}
