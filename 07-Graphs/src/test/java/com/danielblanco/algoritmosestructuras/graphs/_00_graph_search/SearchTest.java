package com.danielblanco.algoritmosestructuras.graphs._00_graph_search;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SearchTest {

  @Test
  public void test() {
    Graph family = new Graph();
    family.addEdge("daniel", "maria");
    family.addEdge("daniel", "pedro");
    family.addEdge("maria", "javier");
    family.addEdge("lucia", "javier");

    assertTrue(searchTest(family, "daniel"));
    assertTrue(searchTest(family, "maria"));
    assertTrue(searchTest(family, "pedro"));
    assertTrue(searchTest(family, "javier"));
    assertTrue(searchTest(family, "lucia"));

    assertFalse(searchTest(family, "juan"));
  }

  private boolean searchTest(Graph graph, String target) {
    Boolean dfs = DepthFirstSearch.depthFirstSearch(graph, target);
    resetNodes(graph);
    Boolean bfs = DepthFirstSearch.depthFirstSearch(graph, target);
    resetNodes(graph);
    return dfs && bfs && dfs == bfs;
  }

  private void resetNodes(Graph graph) {
    for (GraphNode node : graph.nodes.values()) {
      node.status = GraphNodeStatus.Unvisited;
    }
  }
}
