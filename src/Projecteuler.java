import problem_015.Problem_015;
import util.Problem;


public class Projecteuler {

  /**
   * @param args
   */
  public static void main(String[] args) {
    long beginTime = System.currentTimeMillis();

    Problem p = new Problem_015();
    
    System.out.println(p.run());

    System.out.println("interval: " + (System.currentTimeMillis() - beginTime) + "ms");
  }

}
