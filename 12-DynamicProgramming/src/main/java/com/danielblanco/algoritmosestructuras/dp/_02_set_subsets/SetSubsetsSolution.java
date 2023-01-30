package com.danielblanco.algoritmosestructuras.dp._02_set_subsets;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un conjunto de enteros
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 */
public class SetSubsetsSolution {

  List<List<Integer>> subsets(List<Integer> set) {
    List<List<Integer>> subsets = new ArrayList<List<Integer>>();
    subsets.add(new ArrayList<Integer>());
    subsets(set.remove(0), set, subsets);
    return subsets;
  }

  private void subsets(Integer element, List<Integer> remainingSet, List<List<Integer>> subsets) {
    int previousSubsetSize = subsets.size();
    for (int i = 0; i < previousSubsetSize; i++) {
      List<Integer> newSubset = new ArrayList<Integer>(subsets.get(i));
      newSubset.add(element);
      subsets.add(newSubset);
    }

    if (remainingSet.size() != 0) {
      subsets(remainingSet.remove(0), remainingSet, subsets);
    }
  }
}
