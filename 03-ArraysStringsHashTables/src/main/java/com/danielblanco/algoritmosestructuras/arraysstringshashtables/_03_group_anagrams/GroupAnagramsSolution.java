package com.danielblanco.algoritmosestructuras.arraysstringshashtables._03_group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Un anagrama es una palabra creada a partir de la reordenación de las letras de otra palabra. Ej: saco - caso
 * Dado un array de strings, devuelve los anagramas agrupados.
 *
 * Ejemplo:
 *  Input: words = ["saco", "arresto", "programa", "rastreo", "caso"]
 *  Output: [["saco", "caso"], ["arresto", "rastreo"], ["programa"]].
 */
public class GroupAnagramsSolution {

  public List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) return Collections.emptyList();

    Map<String, List<String>> anagramMap = buildAnagramMap(strs);
    return new ArrayList<>(anagramMap.values());
  }

  private Map<String, List<String>> buildAnagramMap(String[] strs) {
    Map<String, List<String>> anagramMap = new HashMap<String, List<String>>();
    for (String s : strs) {
      String hash = getAnagramHash(s);
      if (!anagramMap.containsKey(hash)) {
        anagramMap.put(hash, new ArrayList<String>());
      }

      anagramMap.get(hash).add(s);
    }

    return anagramMap;
  }

  private String getAnagramHash(String s) {
    int[] letterCount = new int[26];
    for (int c : s.toCharArray()) {
      letterCount[c - 'a']++;
    }

    return Arrays.toString(letterCount);
  }
}
