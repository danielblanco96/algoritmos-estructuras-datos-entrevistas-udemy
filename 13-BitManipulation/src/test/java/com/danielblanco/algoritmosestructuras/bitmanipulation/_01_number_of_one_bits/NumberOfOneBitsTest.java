package com.danielblanco.algoritmosestructuras.bitmanipulation._01_number_of_one_bits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberOfOneBitsTest {

  @Test
  public void numberOfOneBitsTest() {
    NumberOfOneBits n = new NumberOfOneBits();

    assertEquals(2, n.numberOfOneBits(3));
    assertEquals(1, n.numberOfOneBits(8));
    assertEquals(3, n.numberOfOneBits(7));
  }
}
