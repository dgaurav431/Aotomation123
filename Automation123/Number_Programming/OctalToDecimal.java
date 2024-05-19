package Number_Programming;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Octal Number: ");
		int n=sc.nextInt();
		getDecimal(n);
	}
	public static void getDecimal(int n){
		int dec=0;		int comp=1;
		while(n>0)
		{
			int rem=n%10;
			if(rem!=0)
			dec=dec+rem*comp;
			comp=comp*8;
			n=n/10;
		}
		System.out.println("The Decimal value is: "+dec);
	}
}
