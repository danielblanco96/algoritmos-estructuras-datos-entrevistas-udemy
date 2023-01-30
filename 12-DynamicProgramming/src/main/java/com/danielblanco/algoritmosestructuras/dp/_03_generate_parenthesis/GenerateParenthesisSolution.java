package com.danielblanco.algoritmosestructuras.dp._03_generate_parenthesis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Dados n pares de paréntesis, implementa un algoritmo para generar todas las combinaciones
 * válidas de paréntesis.
 *
 * Ejemplo 1:
 *  Input:
 *    n: 1
 *  Output:
 *    ["()"]
 *
 * Ejemplo 2:
 *  Input:
 *    n: 3
 *  Output:
 *    ["((()))","(()())","(())()","()(())","()()()"]
 *
 */
public class GenerateParenthesisSolution {

  public List<String> generateParenthesis(int n) {
    if (n < 1) return Collections.emptyList();

    List<String> result = new ArrayList<String>();
    generateParenthesis(n, n, new StringBuilder(), result);
    return result;
  }

  private void generateParenthesis(
      int openLeft, int closeLeft, StringBuilder current, List<String> result) {
    if (openLeft == 0 && closeLeft == 0) {
      result.add(current.toString());
      return;
    }

    if (openLeft > 0) {
      generateParenthesis(openLeft - 1, closeLeft, current.append('('), result);
      current.setLength(current.length() - 1);
    }

    if (closeLeft > openLeft) {
      generateParenthesis(openLeft, closeLeft - 1, current.append(')'), result);
      current.setLength(current.length() - 1);
    }
  }
}
