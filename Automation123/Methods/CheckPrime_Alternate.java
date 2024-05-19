package Methods;

public class CheckPrime_Alternate {

	public static void main(String[] args) {
		
		System.out.println("prime alternate numbers are");
		for(int i=2;i<=500;i++) {
			primeCheck(i);
			}
		}
	public static void primeCheck(int n) {
		int count=0;
		for(int j=2;j<=n/2;j++) {
			if(n%j==0) {
				count++;
				break;
	       }
		}
		if(count==0) {
			System.out.println(n);
		} 
	}
}
