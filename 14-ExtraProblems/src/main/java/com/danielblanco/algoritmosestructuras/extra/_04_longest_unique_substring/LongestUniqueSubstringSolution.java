package com.danielblanco.algoritmosestructuras.extra._04_longest_unique_substring;

import java.util.HashSet;
import java.util.Set;

/*
 * Dada una string, devuelve la longitud de la substring más larga
 * en la que no se repiten caracteres
 *
 * Ejemplo 1:
 *  Input: aabcdefed
 *  Output: 6 (abcdef)
 *
 * Ejemplo 2:
 *  Input: ccccc
 *  Output: 1 (c)
 */
public class LongestUniqueSubstringSolution {

  public int lengthOfLongestSubstring(String s) {
    int i = 0, j = 0, max = 0;
    Set<Character> set = new HashSet<>();

    while (j < s.length()) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        max = Math.max(max, set.size());
      } else {
        set.remove(s.charAt(i++));
      }
    }

    return max;
  }
}
