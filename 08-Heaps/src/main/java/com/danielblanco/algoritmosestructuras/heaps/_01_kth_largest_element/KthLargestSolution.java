package com.danielblanco.algoritmosestructuras.heaps._01_kth_largest_element;

import java.util.PriorityQueue;

/*
 * Diseña una clase para obtener el kth elemento más grande de un stream de datos.
 *
 * KthLargest(int k, int[] nums) Inicializa el objecto con el valor de K y con el conjunto de datos.
 * int add(int val) Añade un nuevo elemento y devuelve el kth mayor actual.
 *
 * Ejemplo:
 *  Input:
 *    k = 4
 *    nums = [1, 2, 3, 4, 5]
 *
 *  Output:
 *    add(6) = 3
 *    add(1) = 3
 *    add(8) = 4
 *
 *
 * Solución: Se utiliza un heap (PriorityQueue) que por defecto ordena los elementos de menor a mayor.
 * Si tenemos n elementos, los insertamos todos, y se eliminan los que pasen de k, entonces nos
 * quedaremos siempre con el kth elemento más grande en la primera posición del heap.
 *
 * Si a continuación añadimos un elemento menor que el kth elemento más grande actual, por el
 * funcionamiento del heap este nuevo elemento quedará en primera posición y se eliminará. Si llega
 * uno más grande, el que se eliminará será el kth elemento más grande actual, y uno nuevo pasará
 * a esa posición.
 */
public class KthLargestSolution {
  private int k;
  private PriorityQueue<Integer> heap;

  public KthLargestSolution(int k, int[] nums) {
    this.k = k;
    heap = new PriorityQueue<>();

    for (int num : nums) {
      heap.add(num);
    }

    while (heap.size() > k) {
      heap.poll();
    }
  }

  public int add(int val) {
    heap.add(val);
    if (heap.size() > k) {
      heap.poll();
    }

    return heap.peek();
  }
}
