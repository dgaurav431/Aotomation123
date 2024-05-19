package Methods;
import java.util.Scanner;
public class PrimeNo {
  public static boolean isPrime(int num) {
	  if (num<=1) {
		  return false;
	  }
	  for(int i=2; i<=num/2; i++) {
		  if(num%i==0) {
			  return false;
		  }
	  }
	  return true;
  }
		
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a num to check for prime");
       if(isPrime(sc.nextInt()) == true) {
    	   System.out.println("entered num is prime");
       }
       else {
    	   System.out.println("entered num is not prime");
       }
       sc.close();
	}

}
