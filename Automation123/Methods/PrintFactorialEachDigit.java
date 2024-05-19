package Methods;
import java.util.Scanner;
public class PrintFactorialEachDigit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		while(n>0) {
			int rem=n%10;
			printEachDigitFactorial(rem);
			n=n/10;
		}
	}
    public static void printEachDigitFactorial(int n) {
    	int fact=1;
    	for(int i=1;i<=n;i++) {
    		fact=fact*i;
    	}
    	System.out.println(n+"!=" +fact);
    }
}
