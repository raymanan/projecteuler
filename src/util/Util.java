package util;

import java.util.ArrayList;
import java.util.List;

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

  public static Long[] getPrimeFactors(long n) {
	List<Long> primeFactors = new ArrayList<Long>();
	long i = 1;

	while (i <= n && n != 1) {
	  if (isPrime(i) && n % i == 0) {
		n = n / i;
		primeFactors.add(i);
		continue;
	  }

	  i++;
	}

	return (Long[]) primeFactors.toArray(new Long[0]);
  }
}
