package problem_001;

public class Problem_001 {
  public static void main(String[] args) {
	int[] in = new int[] { 3, 5 };
	long beginTime = System.currentTimeMillis();

	// System.out.println(multiplesOf(in, 1000));
	System.out.println(sumDivisibleBy(1000000000, 3)
	                   + sumDivisibleBy(1000000000, 5)
	                   - sumDivisibleBy(1000000000, 15));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  private static long multiplesOf(int[] in, int n) {
	long sum = 0;
	for (int i = 0; i < n; i++) {
	  for (int j = 0; j < in.length; j++) {
		if (i % in[j] == 0) {
		  sum = sum + i;
		  break;
		}
	  }
	}

	return sum;
  }

  private static long sumDivisibleBy(long target, long n) {
	long p = target / n;
	return n * (p * (p + 1)) / 2;
  }
}
