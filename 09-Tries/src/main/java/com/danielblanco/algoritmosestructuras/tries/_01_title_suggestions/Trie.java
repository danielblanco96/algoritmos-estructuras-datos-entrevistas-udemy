package com.danielblanco.algoritmosestructuras.tries._01_title_suggestions;

public class Trie {
  TrieNode root;
  boolean ignoreCase;

  public Trie(boolean ignoreCase) {
    root = new TrieNode();
    this.ignoreCase = ignoreCase;
  }

  public void insert(String word) {
    TrieNode currentNode = root;

    if (ignoreCase) {
      word = word.toLowerCase();
    }

    for (char c : word.toCharArray()) {
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

    if (ignoreCase) {
      prefix = prefix.toLowerCase();
    }

    for (char c : prefix.toCharArray()) {
      currentNode = currentNode.children.get(c);
      if (currentNode == null) return false;
    }

    return true;
  }
}
