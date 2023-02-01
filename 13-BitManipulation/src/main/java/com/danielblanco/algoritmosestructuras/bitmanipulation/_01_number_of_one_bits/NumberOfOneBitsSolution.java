package com.danielblanco.algoritmosestructuras.bitmanipulation._01_number_of_one_bits;

/*
 * Dado un entero, devuelve el número de bits a '1' que tiene su representación binaria.
 *
 * Ejemplo 1:
 *  Input: 3 (00000000000000000000000000000011)
 *  Output: 2
 *
 * Ejemplo 2:
 *  Input: 8 (00000000000000000000000000001000)
 *  Output: 1
 */
public class NumberOfOneBitsSolution {

  public int numberOfOneBits(int n) {
    int bitCount = 0;

    while (n != 0) {
      bitCount += (n & 1);
      n >>>= 1;
    }

    return bitCount;
  }
}
