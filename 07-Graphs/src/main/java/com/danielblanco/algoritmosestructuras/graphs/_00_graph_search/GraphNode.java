package com.danielblanco.algoritmosestructuras.graphs._00_graph_search;

import java.util.HashMap;

public class GraphNode {
  public String value;
  public GraphNodeStatus status;
  public HashMap<String, GraphNode> adjacents;

  public GraphNode(String value) {
    this.value = value;
    this.adjacents = new HashMap<String, GraphNode>();
    this.status = GraphNodeStatus.Unvisited;
  }

  public GraphNode(String value, HashMap<String, GraphNode> adjacents) {
    this.value = value;
    this.adjacents = adjacents;
  }

  public void addNeighbor(GraphNode node) {
    if (!adjacents.containsKey(node.value)) {
      adjacents.put(node.value, node);
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((value == null) ? 0 : value.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    GraphNode other = (GraphNode) obj;
    if (value == null) {
      if (other.value != null) return false;
    } else if (!value.equals(other.value)) return false;
    return true;
  }
}
