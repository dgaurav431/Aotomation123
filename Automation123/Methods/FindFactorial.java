package Methods;

public class FindFactorial {

	public static void main(String[] args) {

		int x= findFactorial(6);
		System.out.println(x);
		System.out.println(x+100);
	}
	
	public static int findFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(n+ "!=" +fact);
		return fact;
	}
}
