package com.danielblanco.algoritmosestructuras.bitmanipulation._04_sum_integers;

/*
 * Dados dos enteros, devuelve la suma de ambos sin utilizar los operadores '+' o '-'
 *
 * Ejemplo:
 *  Input:
 *    a: 2
 *    b: 5
 *  Output: 7
 */
public class SumIntegersSolution {

  public int getSum(int a, int b) {
    int result = 0;
    int carry = 0;

    for (int i = 0; i < 32; i++) {
      int firstBit = getBit(a, i);
      int secondBit = getBit(b, i);

      int sum = firstBit ^ secondBit ^ carry;
      result = updateBit(result, i, sum);
      carry =
          (firstBit == 1 && secondBit == 1
                  || firstBit == 1 && carry == 1
                  || carry == 1 && secondBit == 1)
              ? 1
              : 0;
    }

    return result;
  }

  public int getBit(int number, int i) {
    return (number >> i) & 1;
  }

  public int updateBit(int number, int i, int bit) {
    int clearMask = ~(1 << i);
    return (number & clearMask) | (bit << i);
  }
}
