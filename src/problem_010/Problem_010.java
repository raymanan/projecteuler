package problem_010;

import util.Util;

public class Problem_010 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(summationOfPrimes(2000000));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  private static long summationOfPrimes(int n) {
	long sum = 2;
	int number = 3;
	while (number < n) {
	  if (Util.isPrime(number)) {
		sum = sum + number;
	  }
	  number = number + 2;
	}

	return sum;
  }
}
