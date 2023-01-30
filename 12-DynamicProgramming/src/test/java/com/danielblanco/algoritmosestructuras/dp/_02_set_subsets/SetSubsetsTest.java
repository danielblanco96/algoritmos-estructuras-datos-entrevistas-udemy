package com.danielblanco.algoritmosestructuras.dp._02_set_subsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SetSubsetsTest {

  @Test
  public void setSubsetsTest() {
    SetSubsets setSubsets = new SetSubsets();

    List<Integer> set = new ArrayList<>(List.of(1, 2, 3));
    List<List<Integer>> result = setSubsets.subsets(set);
    assertTrue(result.contains(List.of(1, 2, 3)));
    assertTrue(result.contains(List.of(1, 2)));
    assertTrue(result.contains(List.of(1, 3)));
    assertTrue(result.contains(List.of(2, 3)));
    assertTrue(result.contains(List.of(1)));
    assertTrue(result.contains(List.of(2)));
    assertTrue(result.contains(List.of(3)));
    assertTrue(result.contains(List.of()));
    assertEquals(8, result.size());
  }
}
