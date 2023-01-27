package com.danielblanco.algoritmosestructuras.graphs._01_route_between_nodes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.danielblanco.algoritmosestructuras.graphs._00_graph_search.Graph;
import com.danielblanco.algoritmosestructuras.graphs._00_graph_search.GraphNode;
import com.danielblanco.algoritmosestructuras.graphs._00_graph_search.GraphNodeStatus;
import org.junit.jupiter.api.Test;

public class RouteBetweenNodesTest {

  @Test
  public void routeBetweenNodesTest() {
    RouteBetweenNodes routeBetweenNodes = new RouteBetweenNodes();

    Graph graph = new Graph();

    GraphNode node0 = graph.getOrCreateNode("0");
    GraphNode node1 = graph.getOrCreateNode("1");
    GraphNode node3 = graph.getOrCreateNode("3");
    GraphNode node4 = graph.getOrCreateNode("4");
    GraphNode node6 = graph.getOrCreateNode("6");

    graph.addEdge("0", "1");
    graph.addEdge("1", "2");
    graph.addEdge("2", "0");
    graph.addEdge("2", "3");
    graph.addEdge("3", "2");
    graph.addEdge("4", "6");
    graph.addEdge("5", "4");
    graph.addEdge("6", "5");

    assertTrue(routeBetweenNodes.isRouteBetween(graph, node0, node3));
    clear(graph);
    assertTrue(routeBetweenNodes.isRouteBetween(graph, node3, node0));
    clear(graph);
    assertTrue(routeBetweenNodes.isRouteBetween(graph, node6, node4));
    clear(graph);
    assertTrue(routeBetweenNodes.isRouteBetween(graph, node1, node0));
    clear(graph);
    assertFalse(routeBetweenNodes.isRouteBetween(graph, node0, node4));
    clear(graph);

    Graph graph2 = new Graph();
    graph2.addEdge("4", "1");
    graph2.addEdge("4", "3");
    graph2.addEdge("3", "2");
    graph2.addEdge("2", "1");

    node0 = graph2.getOrCreateNode("0");
    node1 = graph2.getOrCreateNode("1");
    GraphNode node2 = graph2.getOrCreateNode("2");
    node3 = graph2.getOrCreateNode("3");
    node4 = graph2.getOrCreateNode("4");

    assertFalse(routeBetweenNodes.isRouteBetween(graph2, node2, node4));
    clear(graph2);
    assertTrue(routeBetweenNodes.isRouteBetween(graph2, node3, node1));
    clear(graph2);
    assertFalse(routeBetweenNodes.isRouteBetween(graph2, node0, node1));
    clear(graph2);
    assertTrue(routeBetweenNodes.isRouteBetween(graph2, node0, node0));
    clear(graph2);
  }

  private void clear(Graph graph) {
    for (GraphNode n : graph.nodes.values()) n.status = GraphNodeStatus.Unvisited;
  }
}
