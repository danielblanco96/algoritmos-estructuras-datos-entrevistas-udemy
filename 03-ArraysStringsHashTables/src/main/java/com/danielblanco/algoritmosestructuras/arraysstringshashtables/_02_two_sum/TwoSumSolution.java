package com.danielblanco.algoritmosestructuras.arraysstringshashtables._02_two_sum;

import java.util.HashMap;
import java.util.Map;

/*
 * Dado un array de números enteros y un target, retorna los índices de dos
 * números para los que la suma de ambos sea igual al target.
 *
 * Puedes asumir que hay solamente una solución.
 *
 * Ejemplo 1:
 *  Input: nums = [9,2,5,6], target = 7
 *  Output: [1,2]
 *  Explicación: nums[1] + nums[2] == 7, devolvemos [1, 2].
 *
 * Ejemplo 2:
 *  Input: nums = [9,2,5,6], target = 100
 *  Output: null
 */
public class TwoSumSolution {

  public int[] twoSum(int[] nums, int target) {
    if (nums == null || nums.length <= 1) return null;

    Map<Integer, Integer> complementMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      if (complementMap.containsKey(nums[i])) return new int[] {complementMap.get(nums[i]), i};
      int complement = target - nums[i];
      complementMap.put(complement, i);
    }

    return null;
  }
}
