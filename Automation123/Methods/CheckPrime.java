package Methods;
public class CheckPrime {
	public static void main(String[] args) {
		System.out.println("prime number is");
		for(int i=2;i<=100;i++) {
			primeCheck(i);
		}
	}
	public static void primeCheck(int x) {
		int count=0;
		
		for(int j=2;j<=x/2;j++) {
			if(x%j==0) {
				count++;
	       }
		}
		if(count==0) {
			System.out.println(x);
		} 
	  }
	}

