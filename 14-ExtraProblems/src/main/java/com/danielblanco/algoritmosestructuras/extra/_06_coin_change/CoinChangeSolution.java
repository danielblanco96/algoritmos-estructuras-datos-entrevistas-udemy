package com.danielblanco.algoritmosestructuras.extra._06_coin_change;

import java.util.Arrays;

/*
 * Dado un array de enteros que representa los distintos tipos de monedas disponibles,
 * devuelve el mínimo número de monedas posible para sumar un valor amount.
 *
 * Si es imposible sumar ese valor, devuelve -1
 *
 * Ejemplo 1:
 *  Input:
 *    coins = [1,2,5]
 *    amount = 11
 *  Output: 3 (5 + 5 + 1)
 *
 * Ejemplo 2:
 *  Input:
 *    coins = [2]
 *    amount = 3
 *  Output: -1
 */
public class CoinChangeSolution {

  public int coinChange(int[] coins, int amount) {
    int memo[] = new int[amount + 1];

    Arrays.fill(memo, -2);
    return coinChange(coins, amount, memo);
  }

  private int coinChange(int[] coins, int amount, int[] memo) {
    if (amount < 0) return -1;
    if (amount == 0) return 0;
    if (memo[amount] != -2) return memo[amount];

    int min = -1;
    for (int c : coins) {
      int res = coinChange(coins, amount - c, memo);
      if (res != -1 && (min == -1 || (res) < min)) min = res + 1;
    }

    memo[amount] = min;
    return min;
  }
}
