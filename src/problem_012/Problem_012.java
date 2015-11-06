package problem_012;

public class Problem_012 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(highlyDivisibleTriangularNumber(500));

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
	for (int i = 1; i <= Math.sqrt(number); i++) {
	  long n = number / i;
	  if (number % i == 0) {
		if (n * n == number) {
		  countOfDivistors = countOfDivistors++;
		} else {
		  countOfDivistors = countOfDivistors + 2;
		}
	  }
	}

	return countOfDivistors;
  }
}
