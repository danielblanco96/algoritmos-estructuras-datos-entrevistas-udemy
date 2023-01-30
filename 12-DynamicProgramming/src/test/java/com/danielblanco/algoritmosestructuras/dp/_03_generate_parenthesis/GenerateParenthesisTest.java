package com.danielblanco.algoritmosestructuras.dp._03_generate_parenthesis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

public class GenerateParenthesisTest {

  @Test
  public void generateParenthesisTest() {
    GenerateParenthesis gp = new GenerateParenthesis();

    List<String> result = gp.generateParenthesis(3);
    assertTrue(result.contains("((()))"));
    assertTrue(result.contains("(()())"));
    assertTrue(result.contains("(())()"));
    assertTrue(result.contains("()(())"));
    assertTrue(result.contains("()()()"));
    assertEquals(5, result.size());
  }
}
