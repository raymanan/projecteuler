package problem_012;

import util.Util;

public class Problem_012 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(highlyDivisibleTriangularNumber(50));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  private static long highlyDivisibleTriangularNumber(int countOfDivisors) {
	int divisors = 1;
	long n = 1;
	while (divisors <= countOfDivisors) {
	  n++;
	  divisors = getCountOfDivisors_2(n * (n + 1) / 2);
	}

	
	return n * (n + 1) / 2;
  }

  private static int getCountOfDivisors_2(long number) {
	if (number == 1) {
	  return 1;
	}
	int countOfDivistors = 0;
	for (int i = 1; i <= number / 2; i++) {
	  if (number % i == 0) {
		countOfDivistors = countOfDivistors + 2;
		number = number / i;
	  }
	}

	return countOfDivistors;
  }

  private static int getCountOfDivisors(long number) {
	Long[] primeFactors = Util.getPrimeFactors(number);
	int countOfDivistors = 1;
	boolean dup = false;

	if (primeFactors.length == 0) {
	  return 1;
	} else if (primeFactors.length == 1) {
	  return 2;
	} else {
	  countOfDivistors = countOfDivistors + 2;
	}

	for (int i = 1; i < primeFactors.length; i++) {
	  if (primeFactors[i] == primeFactors[i - 1]) {
		if (!dup && primeFactors[i] * primeFactors[i] < number) {
		  countOfDivistors++;
		  dup = true;
		}
	  } else {
		countOfDivistors++;
		dup = false;
		if (primeFactors[i] * primeFactors[i - 1] < number) {
		  countOfDivistors++;
		}
	  }
	}

	return countOfDivistors;
  }

}
