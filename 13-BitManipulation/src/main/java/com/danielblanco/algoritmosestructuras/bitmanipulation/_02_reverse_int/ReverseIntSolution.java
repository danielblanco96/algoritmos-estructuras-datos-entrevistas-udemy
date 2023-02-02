package com.danielblanco.algoritmosestructuras.bitmanipulation._02_reverse_int;

/*
 * Dado un entero, devuelve el entero que representa el valor en binario inverso.
 *
 * Ejemplo 1:
 *  Input: -5 (11111111111111111111111111111011)
 *  Output: 3221225471 (11011111111111111111111111111111)
 *
 * Ejemplo 2:
 *  Input: 43261596 (00000010100101000001111010011100)
 *  Output: 964176192 (00111001011110000010100101000000)
 */
public class ReverseIntSolution {

  public int reverseBits(int n) {
    for (int i = 0; i < 16; i++) {
      int firstBit = getBit(n, i);
      int secondBit = getBit(n, 31 - i);

      n = updateBit(n, i, secondBit);
      n = updateBit(n, 31 - i, firstBit);
    }

    return n;
  }

  private int getBit(int n, int i) {
    return (n >> i) & 1;
  }

  private int updateBit(int n, int i, int bit) {
    int clearBitMask = ~(1 << i);
    return (n & clearBitMask) | (bit << i);
  }
}
