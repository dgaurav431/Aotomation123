package Recursion;

import java.util.Scanner;

public class Count_Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("Total digit is: "+getDigit(a));
	}
	public static int getDigit(int n)
	{
		if(n>0)
		{
			return 1+getDigit(n/10);
		}
		else
			return 0;
	}
}
