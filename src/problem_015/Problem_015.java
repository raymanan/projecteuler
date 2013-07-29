package problem_015;

import java.util.ArrayList;
import java.util.List;

public class Problem_015 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(latticePaths(20));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime)
	                   / 1000 + "s");
  }

  private static long latticePaths(int count) {
	long routes = 0;
	Grid grid = generateGrid(count);
	List<Point> points = grid.getPoints();
	for (int i = 0; i < points.size(); i++) {

	}
	return 0;
  }

  private static Grid generateGrid(int count) {
	Grid grid = new Grid(count);
	for (int i = 0; i < count; i++) {
	  for (int j = 0; j < count; j++) {
		Point point = new Point(i, j);
		grid.addPoint(point);
	  }
	}

	return grid;
  }
  
  private static Tree generateTree(int count){
	List<Node> nodes=new ArrayList<Node>();
	Tree tree=new Tree();
	tree.setNodes(nodes);
	
	for (int i = 0; i < count; i++) {
	  Node node=new Node();
	  Point point=new Point(, y)
    }
	
	return tree;
  }
}
