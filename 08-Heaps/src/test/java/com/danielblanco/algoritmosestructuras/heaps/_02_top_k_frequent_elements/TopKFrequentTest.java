package com.danielblanco.algoritmosestructuras.heaps._02_top_k_frequent_elements;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class TopKFrequentTest {

  @Test
  public void topKFrequentTest() {
    TopKFrequent topKFrequent = new TopKFrequent();

    int[] firstResult = topKFrequent.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2);
    Arrays.sort(firstResult);
    assertArrayEquals(new int[] {1, 2}, firstResult);
    assertArrayEquals(new int[] {3}, topKFrequent.topKFrequent(new int[] {1, 1, 2, 3, 3, 3}, 1));
  }
}
