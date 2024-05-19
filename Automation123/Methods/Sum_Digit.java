package Methods;

public class Sum_Digit {

	public static void main(String[] args) {
         sumDigit();
	}
   public static void sumDigit() {
	   int n=5827;
		int sum=0;
		while(n>0) {
		int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("sum of digit is: "+sum);
   }
}
