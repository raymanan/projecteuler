package problem_003;

import util.Util;

public class Problem_003 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(largestPrimeFactor(600851475143L));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  public static long largestPrimeFactor(long n) {
	long i = 2;

	while (!Util.isPrime(n)) {
	  if (n % i == 0) {
		n = n / i;
	  } else {
		i++;
	  }
	}
	return n;
  }

}
