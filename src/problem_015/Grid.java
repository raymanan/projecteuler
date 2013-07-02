package problem_015;

import java.util.ArrayList;
import java.util.List;

class Grid {
  private int width;
  private List<Point> points;

  public Grid(int width) {
	this.width = width;
  }

  public int getWidth() {
	return width;
  }

  public void setWidth(int width) {
	this.width = width;
  }

  public List<Point> getPoints() {
	return points;
  }

  public void setPoints(List<Point> points) {
	this.points = points;
  }

  public void addPoint(Point point) {
	if (points == null) {
	  points = new ArrayList<Point>();
	}

	points.add(point);
  }
}
