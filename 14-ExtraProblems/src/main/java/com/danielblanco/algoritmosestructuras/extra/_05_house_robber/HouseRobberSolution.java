package com.danielblanco.algoritmosestructuras.extra._05_house_robber;

/*
 * Dado un array de enteros que representa el dinero que hay en cada casa en un vecindario,
 * devuelve la mayor cantidad que un ladrón puede robar teniendo en cuenta que no puede robar
 * dos casas consecutivas.
 *
 * Ejemplo 1:
 *  Input: [1,2,3,1]
 *  Output: 4 (La casa 0 y la casa 2)
 *
 * Ejemplo 2:
 *  Input: [2,14,8,3,4]
 *  Output: 18 (La casa 1 y la 4)
 */
public class HouseRobberSolution {

  public int rob(int[] nums) {
    if (nums == null) return 0;

    int prev1 = 0;
    int prev2 = 0;

    for (int num : nums) {
      int tmp = prev1;
      prev1 = Math.max(prev2 + num, prev1);
      prev2 = tmp;
    }
    return prev1;
  }
}
