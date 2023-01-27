package com.danielblanco.algoritmosestructuras.graphs._05_redundant_connection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Dada una lista de proyectos y las dependencias entre ellos, devuelve un orden de
 * compilación válido para dichos proyectos.
 *
 * La lista de dependencias es una lista de pares de strings (a, b), que indican que el
 * proyecto b depende del a (el a debe ser compilado con antelación).
 *
 * Ejemplo 1:
 *  Input:
 *    projects: a, b, c, d
 *    dependencies: [(a, b), (a, c), (a, d), (c, b), (d, b), (d, c)]
 *  Output: a, d, c, b
 *
 * Ejemplo2:
 *  Input:
 *    projects: a, b, c, d
 *    dependencies: [(a, b), (b, c), (c, d), (d, a)]
 *  Output: Lanza excepción. No se puede construir ya que se forma un ciclo.
 *
 */
public class RedundantConnectionSolution {
  public int[] findRedundantConnection(int[][] edges) {
    List<Set<Integer>> adjList = new ArrayList<>();
    for (int i = 0; i <= edges.length; i++) adjList.add(new HashSet<>());

    for (int[] edge : edges) {
      int first = edge[0];
      int second = edge[1];
      if (dfs(first, second, -1, adjList)) {
        return edge;
      } else {
        adjList.get(first).add(second);
        adjList.get(second).add(first);
      }
    }
    return null;
  }

  private boolean dfs(int first, int second, int previous, List<Set<Integer>> adjList) {
    if (first == second) return true;
    for (int w : adjList.get(first)) {
      if (w == previous) continue;
      if (dfs(w, second, first, adjList)) return true;
    }
    return false;
  }
}
