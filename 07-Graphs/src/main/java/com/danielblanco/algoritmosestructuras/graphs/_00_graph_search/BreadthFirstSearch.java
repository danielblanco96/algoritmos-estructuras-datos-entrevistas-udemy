package com.danielblanco.algoritmosestructuras.graphs._00_graph_search;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
  public static boolean breadthFirstSearch(Graph graph, String target) {
    for (GraphNode node : graph.nodes.values()) {
      if (singleBfsHelper(node, target)) return true;
    }

    return false;
  }

  private static boolean singleBfsHelper(GraphNode node, String target) {
    Queue<GraphNode> queue = new LinkedList<GraphNode>();
    queue.add(node);

    while (!queue.isEmpty()) {
      GraphNode currentNode = queue.remove();

      if (currentNode.value.equals(target)) return true;

      currentNode.status = GraphNodeStatus.Visited;

      for (GraphNode adj : currentNode.adjacents.values()) {
        if (adj.status == GraphNodeStatus.Unvisited) {
          queue.add(adj);
        }
      }
    }

    return false;
  }
}
