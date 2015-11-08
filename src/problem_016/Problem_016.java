package problem_016;

import java.math.BigInteger;

import util.Problem;

public class Problem_016 implements Problem {

  @Override
  public String run() {
    Number sum = digitSum1();
    return String.valueOf(sum);
  }

  private long digitSum0() {
    BigInteger pow = BigInteger.valueOf(2);
    pow = pow.pow(1000);

    // double pow = Math.pow(2, 1000);
    String powStr = String.valueOf(pow);
    // System.out.println(powStr);
    String subPowStr = powStr.substring(0, powStr.contains("E") ? powStr.indexOf('E') : powStr.length());

    long sum = 0;

    for (char subString : subPowStr.toCharArray()) {
      if (Character.isDigit(subString)) {
        sum += Integer.parseInt(String.valueOf(subString));
        // sum += subString;
      }
    }
    return sum;
  }

  private BigInteger digitSum1() {
    BigInteger pow = BigInteger.valueOf(2);
    pow = pow.pow(1000);

    return sumOfDigits(pow);
  }

  private int digitSum() {
    int result = 0;

    // BigInteger number = BigInteger.valueOf(2);
    // number = number.pow(1000);

    double number = Math.pow(2, 1000);

    while (number > 0) {
      result += (int) (number % 10);
      number /= 10;
    }

    return result;
  }

  private static BigInteger sumOfDigits(BigInteger n) {
    BigInteger sum = BigInteger.ZERO;
    while (n.compareTo(BigInteger.ZERO) == 1) {
      sum = sum.add(n.remainder(BigInteger.TEN));
      n = n.divide(BigInteger.TEN);
    }
    return sum;
  }
}
