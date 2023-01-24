package com.danielblanco.algoritmosestructuras.sorting._00_sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SortingTest {

  int[] array = new int[] {8, 4, 0, 3, 6, 1, 7, 19, 12, 2};
  int[] expectedArray = new int[] {0, 1, 2, 3, 4, 6, 7, 8, 12, 19};

  @Test
  public void bubbleSort() {
    int[] arrayCp = Arrays.copyOf(array, array.length);
    BubbleSort.sort(arrayCp);
    assertArrayEquals(expectedArray, arrayCp);
  }

  @Test
  public void selectionSort() {
    int[] arrayCp = Arrays.copyOf(array, array.length);
    SelectionSort.sort(arrayCp);
    assertArrayEquals(expectedArray, arrayCp);
  }

  @Test
  public void mergeSort() {
    int[] arrayCp = Arrays.copyOf(array, array.length);
    MergeSort.sort(arrayCp);
    assertArrayEquals(expectedArray, arrayCp);
  }

  @Test
  public void quickSort() {
    int[] arrayCp = Arrays.copyOf(array, array.length);
    QuickSort.sort(arrayCp);
    assertArrayEquals(expectedArray, arrayCp);
  }
}
