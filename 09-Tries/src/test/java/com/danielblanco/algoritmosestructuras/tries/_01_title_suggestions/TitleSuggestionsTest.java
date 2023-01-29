package com.danielblanco.algoritmosestructuras.tries._01_title_suggestions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TitleSuggestionsTest {

  @Test
  public void titleSuggestionsTest() {
    TitleSuggestions titleSuggestions = new TitleSuggestions();

    String[] books = new String[] {"Whatever", "Book 1", "water", "Book 35"};
    String[] prefixes = new String[] {"Wo", "Wa", "Boo", "fr"};
    assertArrayEquals(
        new boolean[] {false, false, true, false},
        titleSuggestions.titleSuggestions(books, prefixes, false));

    assertArrayEquals(
        new boolean[] {false, true, true, false},
        titleSuggestions.titleSuggestions(books, prefixes, true));
  }
}
