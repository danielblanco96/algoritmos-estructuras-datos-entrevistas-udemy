package com.danielblanco.algoritmosestructuras.tries._00_trie;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TrieTest {

  @Test
  public void test() {
    Trie trie = new Trie();

    trie.insert("Day");
    trie.insert("Night");
    trie.insert("Week");
    trie.insert("Year");
    trie.insert("Yellow");
    trie.insert("Dark");

    assertTrue(trie.search("Day"));
    assertTrue(trie.search("Night"));
    assertTrue(trie.search("Week"));
    assertTrue(trie.search("Year"));
    assertTrue(trie.search("Yellow"));
    assertTrue(trie.search("Dark"));
    assertTrue(trie.search("Ye"));
    assertTrue(trie.search("Da"));
    assertTrue(trie.search("Wee"));

    assertFalse(trie.search("Weee"));
    assertFalse(trie.search("Morning"));
    assertFalse(trie.search("Darke"));
    assertFalse(trie.search("Yellowstone"));
  }
}
