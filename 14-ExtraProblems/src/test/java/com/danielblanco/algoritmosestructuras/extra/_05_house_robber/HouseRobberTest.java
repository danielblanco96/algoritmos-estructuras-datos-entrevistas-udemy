package com.danielblanco.algoritmosestructuras.extra._05_house_robber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HouseRobberTest {

  @Test
  public void houseRobberTest() {
    HouseRobberSolution h = new HouseRobberSolution();

    assertEquals(4, h.rob(new int[] {1, 2, 3, 1}));
    assertEquals(18, h.rob(new int[] {2, 14, 8, 3, 4}));
  }
}
