package com.danielblanco.algoritmosestructuras.tries._01_title_suggestions;

/*
 * Implementa un método que reciba un array de títulos de libros, un array con prefijos de búsqueda
 * y que devuelva un array indicando si existen libros con esos prefijos o no.
 *
 * También se indicará si las mayúsculas y minúsculas son tratadas como iguales con un parámetro.
 *
 * Ejemplo 1:
 *  Input:
 *    books: ["Whatever", "Book 1", "water", "Book 35"]
 *    prefixes: ["Wo", "Wa", "Boo", "fr"]
 *    ignoreCase: false
 *
 *  Output:
 *    [false, false, true, false]
 *
 * Ejemplo 2:
 *  Input:
 *    books: ["Whatever", "Book 1", "water", "Book 35"]
 *    prefixes: ["Wo", "Wa", "Boo", "fr"]
 *    ignoreCase: true
 *
 *  Output:
 *    [false, true, true, false]
 */
public class TitleSuggestionsSolution {

  public boolean[] titleSuggestions(String[] books, String[] prefixes, boolean ignoreCase) {
    Trie dictionary = new Trie(ignoreCase);

    for (String book : books) {
      dictionary.insert(book);
    }

    boolean[] result = new boolean[prefixes.length];
    for (int i = 0; i < prefixes.length; i++) {
      result[i] = dictionary.search(prefixes[i]);
    }

    return result;
  }
}
