package Program_Practice;

public class Prime_Best_Program {
	public static void main(String[] args) {

		int count=0;
		for(int i=2;i<=500;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("total prime numbers are: "+count);
	}

	public static boolean checkPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
