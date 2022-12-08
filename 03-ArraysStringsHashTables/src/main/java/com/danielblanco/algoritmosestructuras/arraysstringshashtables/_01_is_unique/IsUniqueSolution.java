package com.danielblanco.algoritmosestructuras.arraysstringshashtables._01_is_unique;

import java.util.HashSet;
import java.util.Set;

/*
 * Dado un método que recibe una String, comprobar si todos los caracteres son únicos o no.
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 */
public class IsUniqueSolution {

  // Asumiendo que es ASCII. Dependiendo de la codificación serán más
  private static int NUMBER_OF_CHARS = 128;

  public boolean isUnique(String s) {
    if (s.length() > NUMBER_OF_CHARS) return false;

    Set<Character> set = new HashSet<Character>();
    for (char c : s.toCharArray()) {
      if (set.contains(c)) return false;
      set.add(c);
    }

    return true;
  }
}
