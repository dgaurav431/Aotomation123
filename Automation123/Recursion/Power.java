package Recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
		System.out.println(a+" to power "+b+" is: "+getPower(a,b));
	}
	public static int getPower(int a, int b)
	{
		if(b==0)
			return 1;
		else if(b>1)
		{
			return a*getPower(a, b-1);
		}
		else
			return a;
	}
}
