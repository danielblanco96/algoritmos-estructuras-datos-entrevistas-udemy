package com.danielblanco.algoritmosestructuras.graphs._02_clone_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Devuelve una copia profunda (clon) de un grafo conexo y no dirigido. Puedes
 * utilizar la clase Node que se ve a continuación, más simple que Graph.
 *
 * Ejemplo:
 *  Input: Nodo de grafo conexo y no dirigido (desde él se puede llegar a los demás)
 *  Output: Un clon de ese grafo (nuevos Nodos, no las mismas referencias).
 */
public class CloneGraphSolution {
  public class Node {
    public int val;
    public List<Node> neighbors;
  }

  public Node cloneGraph(Node node) {
    Map<Integer, Node> map = new HashMap<>();
    return clone(node, map);
  }

  private Node clone(Node node, Map<Integer, Node> map) {
    if (node == null) return null;

    if (map.containsKey(node.val)) return map.get(node.val);

    Node newNode = new Node();
    newNode.val = node.val;
    newNode.neighbors = new ArrayList<Node>();

    map.put(newNode.val, newNode);
    for (Node neighbor : node.neighbors) newNode.neighbors.add(clone(neighbor, map));
    return newNode;
  }
}
