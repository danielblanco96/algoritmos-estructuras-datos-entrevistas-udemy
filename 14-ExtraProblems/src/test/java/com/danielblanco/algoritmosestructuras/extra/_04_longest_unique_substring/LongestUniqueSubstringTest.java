package com.danielblanco.algoritmosestructuras.extra._04_longest_unique_substring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestUniqueSubstringTest {

  @Test
  public void longestUniqueSubstringTest() {
    LongestUniqueSubstring l = new LongestUniqueSubstring();

    assertEquals(6, l.lengthOfLongestSubstring("aabcdefed"));
    assertEquals(1, l.lengthOfLongestSubstring("ccccccc"));
    assertEquals(9, l.lengthOfLongestSubstring("aabcdefedabcdefghie"));
  }
}
