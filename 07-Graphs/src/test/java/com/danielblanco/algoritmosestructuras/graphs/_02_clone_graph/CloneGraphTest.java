package com.danielblanco.algoritmosestructuras.graphs._02_clone_graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.danielblanco.algoritmosestructuras.graphs._02_clone_graph.CloneGraph.Node;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CloneGraphTest {

  @Test
  public void cloneGraphTest() {
    CloneGraph cloneGraph = new CloneGraph();

    Node node1 = cloneGraph.new Node();
    node1.val = 1;
    Node node2 = cloneGraph.new Node();
    node2.val = 2;
    Node node3 = cloneGraph.new Node();
    node3.val = 3;
    Node node4 = cloneGraph.new Node();
    node4.val = 4;

    node1.neighbors = List.of(node2, node3);
    node2.neighbors = List.of(node3);
    node3.neighbors = List.of(node4);
    node4.neighbors = List.of(node2);

    Node clonedNode1 = cloneGraph.cloneGraph(node1);
    Node clonedNode2 = clonedNode1.neighbors.get(0);
    Node clonedNode3 = clonedNode1.neighbors.get(1);
    Node clonedNode4 = clonedNode3.neighbors.get(0);
    assertEquals(1, clonedNode1.val);
    assertNotEquals(node1, clonedNode1);
    assertEquals(2, clonedNode2.val);
    assertNotEquals(node2, clonedNode2);
    assertEquals(3, clonedNode3.val);
    assertNotEquals(node3, clonedNode3);
    assertEquals(4, clonedNode4.val);
    assertNotEquals(node4, clonedNode4);
  }
}
