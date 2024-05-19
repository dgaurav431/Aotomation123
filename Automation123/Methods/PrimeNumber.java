package Methods;

public class PrimeNumber {

	public static void main(String[] args) {
        int i=23;
		if(checkPrime(i)) {
			System.out.println("it is a prime no");
		}
	}
	public static boolean checkPrime (int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
