package com.danielblanco.algoritmosestructuras.arraysstringshashtables._04_zero_matrix;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ZeroMatrixTest {
  @Test
  public void zeroMatrixTest() {
    ZeroMatrix zeroMatrix = new ZeroMatrix();
    int[][] matrix = {
      {2, 1, 3, 0, 2},
      {7, 4, 1, 3, 8},
      {4, 0, 1, 2, 1},
      {9, 3, 4, 1, 9}
    };
    int[][] zeroedMatrix = {{0, 0, 0, 0, 0}, {7, 0, 1, 0, 8}, {0, 0, 0, 0, 0}, {9, 0, 4, 0, 9}};
    zeroMatrix.zeroMatrix(matrix);
    assertTrue(Arrays.deepEquals(zeroedMatrix, matrix));

    int[][] matrix2 = {{2, 0, 2}, {0, 2, 1}, {9, 3, 4}};
    int[][] zeroedMatrix2 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 4}};
    zeroMatrix.zeroMatrix(matrix2);
    assertTrue(Arrays.deepEquals(zeroedMatrix2, matrix2));
  }
}
