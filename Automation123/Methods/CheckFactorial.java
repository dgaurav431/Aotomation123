package Methods;

public class CheckFactorial {

	public static void main(String[] args) {

		findFactorial(6);
		findFactorial(7);
		findFactorial(4);
		}
		public static void findFactorial(int n){
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println(n+"!=" + fact);
		}
}
