package problem_002;

public class Problem_002 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(evenFibonacciNumbers(4000000));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  private static long evenFibonacciNumbers(int limit) {
	int sum = 0;
	int x = 0, y = 1, z = 0;
	do {
	  z = x + y;
	  if (z % 2 == 0)
		sum = sum + z;
	  x = y;
	  y = z;
	} while (z <= limit);

	return sum;
  }

}
