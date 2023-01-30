package com.danielblanco.algoritmosestructuras.dp._01_robot_in_grid;

public class Cell {
  int row;
  int col;

  public Cell(int row, int col) {
    this.row = row;
    this.col = col;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + row;
    result = prime * result + col;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Cell other = (Cell) obj;
    if (row != other.row) return false;
    if (col != other.col) return false;
    return true;
  }
}
