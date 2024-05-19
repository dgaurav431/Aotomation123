package Methods;

public class Print_StrongNo {

	public static void main(String[] args) {

		int count=0;
		for(int i=1;i<=100000;i++) {
			if(i==findSum(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("total such num are: "+count);
	}

	public static int findSum(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum= sum + findFactorial(rem);
			n=n/10;
		}
		return sum;
	}
	public static int findFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
}
