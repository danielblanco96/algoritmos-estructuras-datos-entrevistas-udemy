package com.danielblanco.algoritmosestructuras.graphs._01_route_between_nodes;

import com.danielblanco.algoritmosestructuras.graphs._00_graph_search.Graph;
import com.danielblanco.algoritmosestructuras.graphs._00_graph_search.GraphNode;
import com.danielblanco.algoritmosestructuras.graphs._00_graph_search.GraphNodeStatus;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Dado un grafo dirigido y dos nodos, determina si hay un camino start-end
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
public class RouteBetweenNodesSolution {

  public boolean isRouteBetween(Graph g, GraphNode start, GraphNode end) {
    if (start == end) return true;

    Queue<GraphNode> queue = new LinkedList<>();
    queue.add(start);

    while (!queue.isEmpty()) {
      GraphNode next = queue.remove();

      if (end == next) return true;

      for (GraphNode n : next.adjacents.values()) {
        if (!n.status.equals(GraphNodeStatus.Visited)) {
          queue.add(n);
          n.status = GraphNodeStatus.Visited;
        }
      }
    }

    return false;
  }
}
