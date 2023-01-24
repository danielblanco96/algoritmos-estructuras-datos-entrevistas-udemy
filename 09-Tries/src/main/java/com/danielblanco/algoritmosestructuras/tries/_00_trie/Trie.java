package com.danielblanco.algoritmosestructuras.tries._00_trie;

public class Trie {
  TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  public void insert(String word) {
    TrieNode currentNode = root;
    String lowercaseWord = word.toLowerCase();

    for (char c : lowercaseWord.toCharArray()) {
      TrieNode child = currentNode.children.get(c);
      if (child == null) {
        child = new TrieNode();
        currentNode.children.put(c, child);
      }
      currentNode = child;
    }

    currentNode.isEndOfWord = true;
  }

  public boolean search(String prefix) {
    TrieNode currentNode = root;
    String prefixLowercase = prefix.toLowerCase();

    for (char c : prefixLowercase.toCharArray()) {
      currentNode = currentNode.children.get(c);
      if (currentNode == null) return false;
    }

    return true;
  }
}
