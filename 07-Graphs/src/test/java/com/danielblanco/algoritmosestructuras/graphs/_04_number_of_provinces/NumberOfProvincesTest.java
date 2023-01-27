package com.danielblanco.algoritmosestructuras.graphs._04_number_of_provinces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberOfProvincesTest {

  @Test
  public void numberOfProvincesTest() {
    NumberOfProvinces numberOfProvinces = new NumberOfProvinces();

    int[][] first = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    assertEquals(2, numberOfProvinces.numberOfProvinces(first));
    int[][] second = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    assertEquals(3, numberOfProvinces.numberOfProvinces(second));
  }
}
