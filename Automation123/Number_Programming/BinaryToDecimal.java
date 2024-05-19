package Number_Programming;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Binary Number: ");
		int n=sc.nextInt();
		getDecimal(n);
	}
	public static void getDecimal(int n){
		int dec=0;		int comp=1;
		while(n>0)
		{
			int rem=n%10;
			if(rem==1)
			dec=dec+rem*comp;
			comp=comp*2;
			n=n/10;
		}
		System.out.println("The Decimal value is: "+dec);
	}
}
