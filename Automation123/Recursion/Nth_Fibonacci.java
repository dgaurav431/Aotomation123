package Recursion;

import java.util.Scanner;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int x=sc.nextInt();
		System.out.println(x+"th term of fibonacci is "+getFib(x));
	}
	public static int getFib(int n)
	{
		if(n==1)
			return 0;
		else if(n==2 || n==3)
			return 1;
		else
		return getFib(n-2)+getFib(n-1);
	}

}
