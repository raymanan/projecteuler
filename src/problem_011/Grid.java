package problem_011;

import java.util.List;

class Grid {
  private int width;
  private List<Cell> cells;

  public Grid(int width) {
	this.width = width;
  }

  public int getWidth() {
	return width;
  }

  public void setWidth(int width) {
	this.width = width;
  }

  public List<Cell> getCells() {
	return cells;
  }

  public void setCells(List<Cell> cells) {
	this.cells = cells;
  }
}
