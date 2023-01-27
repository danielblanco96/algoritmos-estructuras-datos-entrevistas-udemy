package com.danielblanco.algoritmosestructuras.graphs._01_route_between_nodes;

import com.danielblanco.algoritmosestructuras.graphs._00_graph_search.Graph;
import com.danielblanco.algoritmosestructuras.graphs._00_graph_search.GraphNode;

/*
 * Determina si el árbol second es subárbol del árbol first.
 *
 * Ejemplo: (Matriz de adyacencia que hemos visto en la teoría):
 *
 *  	 0 1 2 3 4
 *
 *  0	 0 0 0 0 0
 *  1	 0 0 0 0 0
 *  2	 0 1 0 0 0
 *  3	 0 0 1 0 0
 *  4	 0 1 0 1 0
 *
 * isRouteBetween(2, 4) = false
 * isRouteBetween(3, 1) = true
 * isRouteBetween(0, 1) = false
 * isRouteBetween(0, 0) = true
 */
public class RouteBetweenNodes {

  public boolean isRouteBetween(Graph g, GraphNode start, GraphNode end) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}
