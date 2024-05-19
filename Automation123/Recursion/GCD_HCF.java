package Recursion;

import java.util.Scanner;

public class GCD_HCF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
		int gcd=getGcd(a,b);
		System.out.println("The HCF is: "+gcd);
		System.out.println("The LCM is: "+(a*b)/gcd);
	}
	public static int getGcd(int a, int b)
	{
		return b==0?a:getGcd(b, a%b);
		
	}
}
