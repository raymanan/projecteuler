package problem_007;

import util.Util;

public class Problem_007 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(thePrime(10001));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  private static int thePrime(int count) {
	int i = 2;
	int j = 1;
	int prime = 0;
	do {
	  if (Util.isPrime(i)) {
		prime = i;
		System.out.println("prime=" + prime + "; number=" + j);
		j++;
	  }
	  i++;
	} while (j <= count);

	return prime;
  }

}
