package com.danielblanco.algoritmosestructuras._02_valid_parenthesis;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Dado un String que solamente contiene los caracteres '(', ')', '{', '}', '[' y ']',
 * implementa un algoritmo para determinar si es válido.
 *
 * Ejemplo 1:
 *  Input: "([]){}"
 *  Output: true
 *
 * Ejemplo 2:
 *  Input: "({)}"
 *  Output: false
 */
public class ValidParenthesisSolution {
  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<Character>();

    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(getOpposite(c));
      } else {
        if (stack.isEmpty() || stack.pop() != c) return false;
      }
    }

    return stack.isEmpty();
  }

  private char getOpposite(char c) {
    if (c == '(') return ')';
    if (c == '{') return '}';
    if (c == '[') return ']';

    return '0';
  }
}
