package com.danielblanco.algoritmosestructuras.graphs._05_redundant_connection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RedundantConnectionTest {

  @Test
  public void redundantConnectionTest() {
    RedundantConnection redundantConnection = new RedundantConnection();

    int[][] first = {{1, 2}, {1, 3}, {2, 3}};
    assertArrayEquals(new int[] {2, 3}, redundantConnection.findRedundantConnection(first));

    int[][] second = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
    assertArrayEquals(new int[] {1, 4}, redundantConnection.findRedundantConnection(second));
  }
}
