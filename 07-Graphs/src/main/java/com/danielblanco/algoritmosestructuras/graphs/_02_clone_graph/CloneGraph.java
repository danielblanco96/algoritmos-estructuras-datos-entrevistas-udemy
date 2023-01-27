package com.danielblanco.algoritmosestructuras.graphs._02_clone_graph;

import java.util.List;

/*
 * Devuelve una copia profunda (clon) de un grafo conexo y no dirigido. Puedes
 * utilizar la clase Node que se ve a continuación, más simple que Graph.
 *
 * Ejemplo:
 *  Input: Nodo de grafo conexo y no dirigido (desde él se puede llegar a los demás)
 *  Output: Un clon de ese grafo (nuevos Nodos, no las mismas referencias).
 */
public class CloneGraph {

  public class Node {
    public int val;
    public List<Node> neighbors;
  }

  public Node cloneGraph(Node node) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}
