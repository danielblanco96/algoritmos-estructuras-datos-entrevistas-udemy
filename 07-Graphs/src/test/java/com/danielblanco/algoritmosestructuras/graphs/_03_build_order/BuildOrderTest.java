package com.danielblanco.algoritmosestructuras.graphs._03_build_order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

public class BuildOrderTest {

  @Test
  public void buildOrderTest() {
    BuildOrder buildOrder = new BuildOrder();

    String[] projects = {"a", "b", "c", "d"};
    String[][] dependencies = {
      {"a", "b"}, {"a", "c"}, {"a", "d"}, {"c", "b"}, {"d", "b"}, {"d", "c"}
    };

    List<String> result = buildOrder.buildOrder(projects, dependencies);
    assertEquals(List.of("a", "d", "c", "b"), result);

    String[][] cycleDependencies = {{"a", "b"}, {"b", "c"}, {"c", "d"}, {"d", "a"}};

    assertThrows(Exception.class, () -> buildOrder.buildOrder(projects, cycleDependencies));
  }
}
