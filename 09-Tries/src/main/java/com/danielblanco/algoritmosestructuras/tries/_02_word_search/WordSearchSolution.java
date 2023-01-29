package com.danielblanco.algoritmosestructuras.tries._02_word_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Dado un tablero m x n y un array de palabras, retorna todas las palabras existentes en el tablero.
 * Las palabras se pueden formar con caracteres horizontales o verticales, y un caracter no puede ser
 * usado múltiples veces en una palabra.
 *
 * Ejemplo:
 *  Input:
 *    [
 *      ["p","e","r","o"]
 *      ["a","t","a","e"]
 *      ["t","e","l","v"]
 *      ["o","f","l","v"]
 *    ]
 *
 *    words = ["pero","pato","comida", "veo"]
 *
 *  Output: ["pero","pato", "veo"]
 *
 */
public class WordSearchSolution {

  public class TrieNode {
    int count;
    boolean isWord;
    boolean deleted;
    Map<Character, TrieNode> children;

    public TrieNode() {
      deleted = false;
      count = 0;
      isWord = false;
      children = new HashMap<Character, TrieNode>();
    }
  }

  TrieNode root;

  public List<String> findWords(char[][] board, String[] words) {
    if (board == null || words == null) return null;

    root = buildTrie(words);
    List<String> result = new ArrayList<String>();
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[0].length; col++) {
        dfs(
            board,
            row,
            col,
            root,
            new boolean[board.length][board[0].length],
            new StringBuilder(),
            result,
            words.length);
      }
    }

    return result;
  }

  private void dfs(
      char[][] board,
      int row,
      int col,
      TrieNode n,
      boolean[][] visited,
      StringBuilder currWord,
      List<String> result,
      int maxLength) {
    if (n.isWord) {
      result.add(currWord.toString());
      removeWord(root, currWord.toString());
    }
    if (row < 0
        || row >= board.length
        || col < 0
        || col >= board[0].length
        || visited[row][col]
        || result.size() == maxLength) return;

    char currentChar = board[row][col];
    if (!n.children.containsKey(currentChar)) return;

    visited[row][col] = true;
    currWord.append(currentChar);
    TrieNode child = n.children.get(currentChar);

    dfs(board, row - 1, col, child, visited, currWord, result, maxLength);
    if (n.deleted) return;
    dfs(board, row, col + 1, child, visited, currWord, result, maxLength);
    if (n.deleted) return;
    dfs(board, row + 1, col, child, visited, currWord, result, maxLength);
    if (n.deleted) return;
    dfs(board, row, col - 1, child, visited, currWord, result, maxLength);

    visited[row][col] = false;
    currWord.setLength(currWord.length() - 1);
  }

  private TrieNode buildTrie(String[] words) {
    TrieNode root = new TrieNode();
    for (String w : words) addWord(root, w);
    return root;
  }

  private void addWord(TrieNode n, String w) {
    for (char c : w.toCharArray()) {
      TrieNode child = n.children.get(c);
      if (child == null) {
        child = new TrieNode();
        n.children.put(c, child);
      }
      n = child;
      n.count++;
    }
    n.isWord = true;
  }

  private void removeWord(TrieNode n, String w) {
    for (char c : w.toCharArray()) {
      TrieNode child = n.children.get(c);

      n = child;
      n.count--;
    }
    n.isWord = false;
  }
}
