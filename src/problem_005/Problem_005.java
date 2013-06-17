package problem_005;

public class Problem_005 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(smallestMultiple(1, 20));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  private static int smallestMultiple(int from, int to) {
	int n = 1;
	boolean divisible ;
	do {
	  divisible = true;
	  for (int i = from; i <= to; i++) {
		if (n % i != 0) {
		  n++;
		  divisible = false;
		  break;
		}
	  }
	} while (!divisible);

	return n;
  }
}
