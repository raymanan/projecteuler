package problem_009;

public class Problem_009 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(specialPythagoreanTriplet(1000));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  private static long specialPythagoreanTriplet(int n) {
	int limit = (n - 3) / 3;

	for (int i = 3; i < limit; i++) {
	  for (int j = i + 1; j < (n - 1 - i) / 2; j++) {
		int c = n - i - j;
		if (i * i + j * j == c * c) {
		  return i * j * c;
		}
	  }
	}

	return -1;
  }
}
