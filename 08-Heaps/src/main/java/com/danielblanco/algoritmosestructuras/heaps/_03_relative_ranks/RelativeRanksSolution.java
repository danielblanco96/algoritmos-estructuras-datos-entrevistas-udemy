package com.danielblanco.algoritmosestructuras.heaps._03_relative_ranks;

import java.util.PriorityQueue;

/*
 * Recibes un array de puntuaciones, en el que el valor de la posición i se corresponde
 * con la puntuación del participante i. No puede haber puntuaciones repetidas.
 *
 * Devuelve un array con la posición obtenida por cada participante, dando medallas a los
 * tres primeros.
 *
 * Ejemplo 1:
 *  Input: [5,4,3,2,1]
 *  Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
 *
 * Ejemplo 2:
 *  Input: [10,3,8,9,4]
 *  Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
 */
public class RelativeRanksSolution {
  public String[] findRelativeRanks(int[] score) {
    int numberOfPlayers = score.length;
    String[] res = new String[numberOfPlayers];

    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> score[b] - score[a]);

    for (int i = 0; i < numberOfPlayers; i++) {
      pq.add(i);
    }

    int position = 1;
    while (!pq.isEmpty()) {
      int playerIndex = pq.poll();

      switch (position) {
        case 1:
          res[playerIndex] = "Gold Medal";
          break;
        case 2:
          res[playerIndex] = "Silver Medal";
          break;
        case 3:
          res[playerIndex] = "Bronze Medal";
          break;
        default:
          res[playerIndex] = Integer.toString(position);
      }

      position++;
    }

    return res;
  }
}
