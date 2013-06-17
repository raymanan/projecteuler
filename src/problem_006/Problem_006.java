package problem_006;

public class Problem_006 {
  public static void main(String[] args) {
	long beginTime = System.currentTimeMillis();

	System.out.println(sumSquareDifference(100));

	System.out.println("interval: " + (System.currentTimeMillis() - beginTime));
  }
  
  private static int sumSquareDifference(int n){
	int sum=0;
	for (int i = 1; i <= n; i++) {
	  sum=sum+i*i;
    }
	
	return (1+n)*(n/2)*(1+n)*(n/2)-sum;
  }
}
