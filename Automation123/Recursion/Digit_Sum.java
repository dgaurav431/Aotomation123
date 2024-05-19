package Recursion;

import java.util.Scanner;

public class Digit_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("Total digit Sum is: "+getDigitSum(a));
	}
	public static int getDigitSum(int n)
	{
		if(n>0)
		{
			return n%10+getDigitSum(n/10);
		}
		else
			return 0;
	}
}
