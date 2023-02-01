package com.danielblanco.algoritmosestructuras.extra._02_word_break;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

public class WordBreakTest {

  @Test
  public void wordBreakTest() {
    WordBreak wordBreak = new WordBreak();

    assertTrue(wordBreak.wordBreak("applepenapple", List.of("apple", "pen")));
    assertFalse(wordBreak.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
  }
}
