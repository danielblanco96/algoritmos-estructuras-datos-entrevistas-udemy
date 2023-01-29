package com.danielblanco.algoritmosestructuras.extra._02_word_break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Dada una string s y un diccionario de palabras wordDict, devuelve si s puede ser dividida usando
 * solamente palabras de wordDict.
 *
 * Ejemplo 1:
 *  Input:
 *    s: "applepenapple"
 *    wordDict: ["apple","pen"]
 *
 *  Output: true
 *
 * Ejemplo 2:
 *  Input:
 *    s: "catsandog"
 *    wordDict: ["cats","dog","sand","and","cat"]
 *
 *  Output: false
 */
public class WordBreakSolution {

  public boolean wordBreak(String s, List<String> wordDict) {
    boolean[] memo = new boolean[s.length() + 1];
    return wordBreakHelper(s, new HashSet<>(wordDict), memo);
  }

  private boolean wordBreakHelper(String s, Set<String> wordDict, boolean[] memo) {
    if (memo[s.length()] == true) return false;
    for (int i = 1; i <= s.length(); i++) {
      String firstWord = s.substring(0, i);
      if (wordDict.contains(firstWord)) {
        String secondWord = s.substring(i, s.length());
        if (secondWord.length() == 0
            || wordDict.contains(secondWord)
            || wordBreakHelper(secondWord, wordDict, memo)) {
          return true;
        }
      }
    }

    memo[s.length()] = true;
    return false;
  }
}
