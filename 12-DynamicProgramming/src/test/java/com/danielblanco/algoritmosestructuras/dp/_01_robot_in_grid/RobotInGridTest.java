package com.danielblanco.algoritmosestructuras.dp._01_robot_in_grid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class RobotInGridTest {

  @Test
  public void robotInGridTest() {
    RobotInGridSolution r = new RobotInGridSolution();

    boolean[][] grid = {
      {true, true, true, true},
      {false, false, false, true},
      {true, true, false, true},
      {true, true, false, true}
    };

    List<Cell> expectedPath =
        List.of(
            new Cell(0, 0),
            new Cell(0, 1),
            new Cell(0, 2),
            new Cell(0, 3),
            new Cell(1, 3),
            new Cell(2, 3),
            new Cell(3, 3));
    List<Cell> cells = r.getPath(grid);
    assertEquals(expectedPath, cells);

    boolean[][] grid2 = {
      {true, true, true, true},
      {false, true, true, true},
      {true, true, false, false},
      {true, true, true, true}
    };

    List<Cell> expectedPath2 =
        List.of(
            new Cell(0, 0),
            new Cell(0, 1),
            new Cell(1, 1),
            new Cell(2, 1),
            new Cell(3, 1),
            new Cell(3, 2),
            new Cell(3, 3));
    List<Cell> cells2 = r.getPath(grid2);
    assertEquals(expectedPath2, cells2);
  }
}
