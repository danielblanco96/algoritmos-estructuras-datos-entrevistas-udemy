package com.danielblanco.algoritmosestructuras.arraysstringshashtables._01_is_unique;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsUniqueTest {

  @Test
  public void isUniqueTest() {
    IsUnique isUnique = new IsUnique();
    assertTrue(isUnique.isUnique("abcde"));
    assertTrue(isUnique.isUnique("aAbBcCdDeE"));
    assertFalse(isUnique.isUnique("abcded"));
  }
}
