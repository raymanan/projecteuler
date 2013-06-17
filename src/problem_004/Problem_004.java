package problem_004;

public class Problem_004 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(largestPalindromeProduct(3));
	// a();

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  private static long largestPalindromeProduct(int numberOfDigit) {
	char[] iStart = new char[numberOfDigit];
	char[] iEnd = new char[numberOfDigit];
	iEnd[0] = '1';
	for (int i = 0; i < numberOfDigit; i++) {
	  iStart[i] = '9';
	  if (i < numberOfDigit - 1) {
		iEnd[i + 1] = '0';
	  }
	}

	long largest = 0;

	int start = Integer.valueOf(String.valueOf(iStart));
	int end = Integer.valueOf(String.valueOf(iEnd));
	for (int i = start; i > end; i--) {
	  for (int j = start; j > end; j--) {
		long s = i * j;
		if (isPalindrome(s)) {
		  System.out.println(i + "*" + j);
		  if (s > largest) {
			largest = s;
		  }
		}
	  }
	}

	return largest;
  }

  private static boolean isPalindrome(long number) {
	int size = Long.toString(number).length();
	int middle = size / 2;
	String part1 = Long.toString(number).substring(0, middle);
	String part2 = new StringBuilder(Long.toString(number).substring(
	    middle,
	    size)).reverse().toString();

	if (part1.equals(part2)) {
	  return true;
	}

	return false;
  }

  public static void a() {
	int largest = 0;

	for (int x = 100; x < 1000; x++) {
	  for (int y = 100; y < 1000; y++) {
		int sum = x * y;

		int size = Integer.toString(sum).length();
		int middle = size / 2;

		String part1 = Integer.toString(sum).substring(0, middle);
		String part2 = new StringBuilder(Integer.toString(sum).substring(
		    middle,
		    size)).reverse().toString();

		if (part1.equals(part2)) {
		  if (sum > largest) {
			largest = sum;
		  }
		}
	  }
	}
	System.out.println(largest);
  }
}
