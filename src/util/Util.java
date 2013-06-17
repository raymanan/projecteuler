package util;

public final class Util {
  public static boolean isPrime(long n) {
	if (n <= 1)
	  return false;
	double limit = Math.sqrt(n);

	for (int i = 2; i <= limit; i++) {
	  if (n % i == 0) {
		return false;
	  }
	}
	return true;
  }
}
