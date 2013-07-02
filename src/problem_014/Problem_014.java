package problem_014;

import java.util.ArrayList;
import java.util.List;

public class Problem_014 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(longestCollatzSequence(1000000));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }

  private static long longestCollatzSequence(long count) {
	long longestChain = 0;
	long start = 0;

	for (int i = 0; i <= count; i++) {
	  int length = getCollatzSequence(i).length;
	  // System.out.println("startNumber: " + i + "; length: " + length);
	  if (length > longestChain) {
		longestChain = length;
		start = i;
	  }
	}
	return start;
  }

  private static Long[] getCollatzSequence(long startNumber) {
	List<Long> seq = new ArrayList<Long>();

	long n = startNumber;
	seq.add(n);
	while (n > 1) {
	  if (n % 2 == 0) {
		n = n / 2;
	  } else {
		n = 3 * n + 1;
	  }

	  seq.add(n);
	}

	return (Long[]) seq.toArray(new Long[seq.size()]);
  }
}
