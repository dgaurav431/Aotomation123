package Number_Programming;

import java.util.Scanner;

public class Big_Small_Digit1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num...");
		int n= sc.nextInt();
		
		digit(n);
	}
	
	public static void digit(int n) {
		int a=n;
		int biggest=0;
		int smallest=9;
		while(n>0) {
			int rem= n%10;
			if(rem>biggest) {
				biggest=rem;
			}
			if(rem<smallest) {
				smallest=rem;
			}
			n=n/10;
		}
		if(a!=0) {
			System.out.println("Biggest digit is: "+biggest);
			System.out.println("Smallest digit is: "+smallest);
		}
		else
			System.out.println("biggest and smallest num is zero");
	}
	
}
