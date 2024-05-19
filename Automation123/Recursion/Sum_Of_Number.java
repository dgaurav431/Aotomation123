package Recursion;

import java.util.Scanner;

public class Sum_Of_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x=sc.nextInt();
		System.out.println("The sum upto "+x+" is: "+getSum(x));
	}
	public static int getSum(int n)
	{
		if(n>1)
		{
			return n+getSum(n-1);
		}
		else
			return n;
	}
}
