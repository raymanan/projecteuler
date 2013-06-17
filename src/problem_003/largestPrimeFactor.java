package problem_003;
public class largestPrimeFactor {
  public static void main(String[] args) {
	long num = 600851475143L;
	System.out.println("Solution: " + findFactors(num));
  }

  public static long findFactors(long num) {
	int multiplier = 2;
	while (!isPrime(num)) {
	  if (num % multiplier == 0) {
		num = num / multiplier;
	  } else {
		multiplier++;
	  }
	}
	return num;
  }

  // Fermat primality test
  private static Boolean isPrime(long num) {
	long numMinusOne = num - 1;
	if ((Math.pow(generateRandomInt(1, (int) numMinusOne), numMinusOne) % num) != 1) {
	  return false;
	} else {
	  return true;
	}
  }

  // Generates random integer between two values: [min, max]
  private static int generateRandomInt(int min, int max) {
	return min + (int) (Math.random() * ((max - min) + 1));
  }
}