package com.danielblanco.algoritmosestructuras.bitmanipulation._03_number_conversion;

/*
 * Dados dos enteros, devuelve el número de bits que debes modificar para convertir el
 * primer entero en el segundo.
 *
 * Ejemplo:
 *  Input:
 *    a: 5 (0101)
 *    b: 8 (1000)
 *
 *  Output: 3
 */
public class NumberConversionSolution {

  public int numberOfBitsToFlipToConvert(int a, int b) {
    int numberOfBitsToFlip = 0;
    while (a != 0 || b != 0) {
      int bitFromA = a & 1;
      int bitFromB = b & 1;
      if (bitFromA != bitFromB) {
        numberOfBitsToFlip++;
      }

      a >>>= 1;
      b >>>= 1;
    }

    return numberOfBitsToFlip;
  }
}
