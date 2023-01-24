package com.danielblanco.algoritmosestructuras.sorting._00_sorting;

public class MergeSort {

  public static void sort(int[] array) {
    int[] helper = new int[array.length];
    sort(array, helper, 0, array.length - 1);
  }

  private static void sort(int[] array, int[] helper, int low, int high) {
    if (low < high) {
      int middle = (low + high) / 2;
      sort(array, helper, low, middle); // Ordena lado izquierdo
      sort(array, helper, middle + 1, high); // Ordena lado derecho
      merge(array, helper, low, middle, high); // Mezcla ambos
    }
  }

  private static void merge(int[] array, int[] helper, int low, int middle, int high) {
    /* Copia ambas mitades en el array auxiliar */
    for (int i = low; i <= high; i++) {
      helper[i] = array[i];
    }

    int helperLeft = low;
    int helperRight = middle + 1;
    int current = low;

    /* Itera el array auxiliar. Compara la mitad izquierda y la derecha, copiando el menor elemento
     * de las dos mitades al array original. */
    while (helperLeft <= middle && helperRight <= high) {
      if (helper[helperLeft] <= helper[helperRight]) {
        array[current] = helper[helperLeft];
        helperLeft++;
      } else {
        array[current] = helper[helperRight];
        helperRight++;
      }
      current++;
    }

    /* Copia el resto del lado izquierdo en el target array.
     * Los elementos de la izquierda no se copian ya que ya se encuentran en el array. Por ejemplo
     * 3 5 14 || 2 4 6. Por orden, copiamos 2, 3, 4, 5 y 6 al array, por lo que tenemos que copiar
     * el resto de la izquierda (14)
     * Otro ejemplo: 2 4 6 || 3 5 14. Copiamos 2, 3, 4, 5 y 6 al array.
     * El array helper es una copia del array, por lo que no tenemos que copiar esa parte,
     * ya está en su posición.
     */
    int remaining = middle - helperLeft;
    for (int i = 0; i <= remaining; i++) {
      array[current + i] = helper[helperLeft + i];
    }
  }
}
