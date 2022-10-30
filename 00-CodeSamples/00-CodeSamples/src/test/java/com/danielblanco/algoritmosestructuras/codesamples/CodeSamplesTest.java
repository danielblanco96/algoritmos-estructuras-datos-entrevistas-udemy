package com.danielblanco.algoritmosestructuras.codesamples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CodeSamplesTest {
  CodeSamples codeSamples = new CodeSamples();

  @Test
  public void testFibonacci() {
    System.out.println(codeSamples.fibonacci(46));
  }

  @Test
  public void testFibonacciDynamicProgramming() {
    System.out.println(codeSamples.fibonacciMemo(46));
    System.out.println(codeSamples.fibonacciBottomUp(46));

    assertEquals(1836311903, codeSamples.fibonacciMemo(46));
    assertEquals(1836311903, codeSamples.fibonacciBottomUp(46));
  }
}
