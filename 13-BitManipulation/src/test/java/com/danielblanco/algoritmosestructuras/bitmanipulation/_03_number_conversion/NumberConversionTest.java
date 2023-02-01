package com.danielblanco.algoritmosestructuras.bitmanipulation._03_number_conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberConversionTest {

  @Test
  public void numberConversionTest() {
    NumberConversion n = new NumberConversion();

    assertEquals(3, n.numberOfBitsToFlipToConvert(5, 8));
    assertEquals(0, n.numberOfBitsToFlipToConvert(8, 8));
    assertEquals(1, n.numberOfBitsToFlipToConvert(5, 7));
  }
}
