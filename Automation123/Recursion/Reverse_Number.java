package Recursion;

import java.util.Scanner;

public class Reverse_Number {

	static int rev=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("The reverse of "+a+" is: "+getReverse(a));
	}
	public static int getReverse(int n)
	{
		if(n>0)
		{
			int rem=n%10;
			rev=10*rev+rem;
			getReverse(n/10);
		}
		return rev;
	}
}
