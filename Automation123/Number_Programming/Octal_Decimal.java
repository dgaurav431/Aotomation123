package Number_Programming;

import java.util.Scanner;

public class Octal_Decimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Octal Number: ");
		int n=sc.nextInt();
		System.out.println(getDecimal(n));
	}
	public static String getDecimal(int n){
		int dec=0;		int comp=1;
		while(n>0)
		{
			int rem=n%10;
			if(rem<=7)
			{
			dec=dec+rem*comp;
			}
			else
			{
				return "Invalid Octal Input";
			}
			comp=comp*8;
			n=n/10;
		}
		return "The Decimal Value is: "+dec;
	}

}
