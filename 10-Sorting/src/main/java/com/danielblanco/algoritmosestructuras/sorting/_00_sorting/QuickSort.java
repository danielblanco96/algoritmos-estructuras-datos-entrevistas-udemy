package com.danielblanco.algoritmosestructuras.sorting._00_sorting;

/*
 * Dividimos la lista en dos recursivamente, una parte con los elementos más pequeños que el pivote
 * y la otra mitad con los más grandes.
 *
 * O(n log(n)) tiempo medio y O(n^2) peor caso porque el pivote podría estar lejos de la mediana.
 * Si el pivote seleccionado es siempre el mayor o menor número estaríamos haciando un bubble sort.
 */
public class QuickSort {

  public static void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private static void sort(int[] array, int low, int high) {
    if (low < high) {
      // Índice de partition, arr[p] se encuentra ahora en la posición correcta.
      int index = partition(array, low, high);

      // Ordenamos los elementos antes y después de la partición de forma separada.
      sort(array, low, index - 1);
      sort(array, index + 1, high);
    }
  }

  /*
   * Esta función toma el último elemento como pivote, lo coloca en su posición correcta y
   * posiciona los elementos menores que él a su izquierda y los mayores a la derecha.
   */
  private static int partition(int[] array, int low, int high) {
    int pivot = array[high];

    // Índice del menor elemento. Indica la posición correcta del pivote hasta el momento.
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {
      if (array[j] < pivot) {
        // Incrementamos el índice del menor elemento si el actual es menor que el pivote.
        i++;
        SearchUtils.swap(array, i, j);
      }
    }

    // Movemos el pivote a la posición correcta.
    SearchUtils.swap(array, i + 1, high);
    return i + 1;
  }
}
