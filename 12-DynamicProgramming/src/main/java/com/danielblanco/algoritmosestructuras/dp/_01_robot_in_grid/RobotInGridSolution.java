package com.danielblanco.algoritmosestructuras.dp._01_robot_in_grid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * Un robot está en la esquina superior izquierda (0,0) de un tablero m x n. En el tablero hay celdas
 * transitables (true) y no transitables (false). Encuentra un camino válido para ir a la esquina
 * inferior izquierda con el robot
 *
 * Ejemplo:
 *  Input:
 *    [
 *      [true,true,true,true]
 *      [false,false,false,true]
 *      [true,true,false,true]
 *      [true,true,false,true]
 *    ]
 *
 *  Output: [(0,0), (0,1), (0,2), (0,3), (1,3), (2,3), (3,3)]
 *
 */
public class RobotInGridSolution {

  List<Cell> getPath(boolean[][] grid) {
    if (grid == null || grid.length == 0) return null;
    List<Cell> path = new ArrayList<Cell>();
    HashSet<Cell> failedCells = new HashSet<Cell>();
    if (getPath(grid, grid.length - 1, grid[0].length - 1, path, failedCells)) {
      return path;
    }
    return null;
  }

  boolean getPath(boolean[][] grid, int row, int col, List<Cell> path, HashSet<Cell> failedCells) {
    if (col < 0 || row < 0 || !grid[row][col]) {
      return false;
    }

    Cell cell = new Cell(row, col);

    if (failedCells.contains(cell)) {
      return false;
    }

    boolean isAtOrigin = (row == 0) && (col == 0);

    if (isAtOrigin
        || getPath(grid, row, col - 1, path, failedCells)
        || getPath(grid, row - 1, col, path, failedCells)) {
      path.add(cell);
      return true;
    }
    failedCells.add(cell);
    return false;
  }
}
