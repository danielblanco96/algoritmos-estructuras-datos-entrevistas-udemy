package com.danielblanco.algoritmosestructuras.codesamples;

public class CodeSamples {

  class Employee {
    String name;

    public Employee(String name) {
      this.name = name;
    }

    String getName() {
      return name;
    }
  }

  int oNSum() {
    int[] array = new int[] {};

    int sum = 0;
    int product = 1;

    for (int val : array) {
      sum += val;
      product *= val;
    }

    return sum + product;
  }

  int oNSum2() {
    int[] array = new int[] {};

    int sum = 0;
    int product = 1;

    for (int val : array) {
      sum += val;
    }

    for (int val : array) {
      product *= val;
    }

    return sum + product;
  }

  int oN2um() {
    int[] array = new int[] {};

    int sum = 0;
    int result = 0;

    for (int val : array) {
      sum += val;
    }

    for (int x : array) {
      for (int y : array) {
        result += x * y - sum;
      }
    }

    return result;
  }

  int oNSum3() {
    int[] arrayA = new int[] {};
    int[] arrayB = new int[] {};

    int sum = 0;

    for (int val : arrayA) {
      sum += val;
    }

    for (int val : arrayB) {
      sum += val;
    }

    return sum;
  }

  int max(int a, int b) {
    if (a >= b) return a;
    return b;
  }

  Employee linearSearch(Employee[] employees, String name) {
    for (Employee e : employees) {
      if (name.equals(e.getName())) return e;
    }

    return null;
  }

  void printPairs(int[] array) {
    for (int x : array) {
      for (int y : array) {
        System.out.println(x + " " + y);
      }
    }
  }

  void nFactorialExample(int n) {
    for (int i = 0; i < n; i++) {
      nFactorialExample(n - 1);
    }
  }

  void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int reversePosition = array.length - 1 - 1;
      int tmpVal = array[i];
      array[i] = array[reversePosition];
      array[reversePosition] = tmpVal;
    }
  }

  void printUnorderedPairs(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        System.out.println(i + " " + j);
      }
    }
  }

  int product(int a, int b) {
    int result = 0;
    for (int i = 0; i < b; i++) {
      result += a;
    }
    return result;
  }

  int[] copyArray(int[] array) {
    int[] copy = new int[0];
    for (int val : array) {
      copy = appendToNew(copy, val);
    }
    return copy;
  }

  int[] appendToNew(int[] array, int val) {
    int[] bigger = new int[array.length + 1];
    for (int i = 0; i < array.length; i++) {
      bigger[i] = array[i];
    }

    bigger[bigger.length - 1] = val;
    return bigger;
  }

  void printPairsTwoArrays(int[] arrayA, int[] arrayB) {
    for (int valA : arrayA) {
      for (int valB : arrayB) {
        System.out.println(valA + " " + valB);
      }
    }
  }

  int intPowerOfTwo(int val) {
    int result = 0;
    while (val > 1) {
      result++;
      val /= 2;
    }
    return result;
  }

  int fibonacci(int n) {
    if (n < 2) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  int fibonacciMemo(int n) {
    return fibonacciMemo(n, new int[n + 1]);
  }

  int fibonacciMemo(int n, int[] memo) {
    if (n < 2) return n;

    if (memo[n] == 0) {
      memo[n] = fibonacciMemo(n - 2, memo) + fibonacciMemo(n - 1, memo);
    }

    return memo[n];
  }

  int fibonacciBottomUp(int n) {
    if (n < 2) return n;

    int previousOfPrevious = 0;
    int previous = 1;

    for (int i = 2; i < n; i++) {
      int current = previous + previousOfPrevious;
      previousOfPrevious = previous;
      previous = current;
    }

    return previous + previousOfPrevious;
  }

  boolean getBit(int num, int index) {
    int mask = (1 << index);
    return ((num & mask) != 0);
  }

  int setBit(int num, int index) {
    int mask = (1 << index);
    return num | mask;
  }

  int clearBit(int num, int index) {
    int mask = ~(1 << index);
    return num & mask;
  }

  int clearBitsFromMostSignificantToIndex(int num, int index) {
    int mask = (1 << index) - 1;
    return num & mask;
  }

  int cleatBitsFromIndexToLessSignificant(int num, int index) {
    int mask = (-1 << (index + 1));
    return num & mask;
  }
}
