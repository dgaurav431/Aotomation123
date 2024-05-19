package Methods;
import java.util.Scanner;
public class Strong_No {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		if(n==findSum(n)) {
			System.out.println("it is a strong no");
		}
		else {
			System.out.println("it is not a strong no");
		}
	}

	public static int findSum(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
   		 sum=sum+findFactorial(rem);
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
