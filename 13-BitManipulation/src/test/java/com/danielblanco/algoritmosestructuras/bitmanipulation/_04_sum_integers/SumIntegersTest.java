package com.danielblanco.algoritmosestructuras.bitmanipulation._04_sum_integers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumIntegersTest {

  @Test
  public void sumIntegersTest() {
    SumIntegers sum = new SumIntegers();
    assertEquals(7, sum.getSum(2, 5));
    assertEquals(4, sum.getSum(1, 3));
    assertEquals(23, sum.getSum(10, 13));
    assertEquals(-5, sum.getSum(3, -8));
    assertEquals(-10, sum.getSum(-3, -7));
  }
}
