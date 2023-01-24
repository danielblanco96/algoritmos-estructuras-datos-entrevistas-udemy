package com.danielblanco.algoritmosestructuras.searching._00_binary_search;

public class BinarySearch {

  int binarySearch(int[] array, int target) {
    return binarySearch(array, 0, array.length - 1, target);
  }

  private int binarySearch(int[] array, int left, int right, int target) {
    if (right >= left) {
      int mid = left + (right - left) / 2;

      // Elemento presente en el elemento central del array.
      if (array[mid] == target) return mid;

      // Si el elemento es menor que el central, se debe encontrar a su izquierda.
      if (array[mid] > target) return binarySearch(array, left, mid - 1, target);

      // En caso contrario solo puede encontrarse en la mitad derecha.
      return binarySearch(array, mid + 1, right, target);
    }

    // El elemento no se ha encontrado.
    return -1;
  }
}
