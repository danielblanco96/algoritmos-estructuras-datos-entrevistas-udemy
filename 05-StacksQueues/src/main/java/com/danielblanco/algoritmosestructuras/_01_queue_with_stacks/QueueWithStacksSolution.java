package com.danielblanco.algoritmosestructuras._01_queue_with_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Implementa una clase MyQueue utilizando dos stacks.
 *
 * Como Stack usaremos la Interfaz Deque, que proporciona las operaciones de una cola doblemente terminada,
 * permitiéndola usar como Pila o Cola (solo las operaciones de Pila están permitidas en este ejercicio).
 *
 * Java también tiene la clase Stack, pero su uso no está recomendado por extender de la clase Vector, que
 * no tiene demasiado sentido, y por ser una clase específica y no una interfaz. Si quieres saber más sobre
 * este tema puedes acceder al siguiente enlace:
 * https://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-stack
 */
public class QueueWithStacksSolution {
  Deque<Integer> firstStack = new ArrayDeque<>();
  Deque<Integer> secondStack = new ArrayDeque<>();

  public void add(Integer value) {
    firstStack.push(value);
  }

  private void shiftStacks() {
    if (secondStack.isEmpty()) {
      while (!firstStack.isEmpty()) {
        secondStack.push(firstStack.pop());
      }
    }
  }

  public Integer peek() {
    shiftStacks();
    return secondStack.peek();
  }

  public Integer remove() {
    shiftStacks();
    return secondStack.pop();
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return firstStack.size() + secondStack.size();
  }
}
