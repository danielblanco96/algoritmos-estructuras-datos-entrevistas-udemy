package com.danielblanco.algoritmosestructuras.extra._06_coin_change;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CoinChangeTest {

  @Test
  public void houseRobberTest() {
    CoinChange c = new CoinChange();

    assertEquals(3, c.coinChange(new int[] {1, 2, 5}, 11));
    assertEquals(-1, c.coinChange(new int[] {2}, 3));
  }
}
