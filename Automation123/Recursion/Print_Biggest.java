package Recursion;

import java.util.Scanner;

public class Print_Biggest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
		System.out.println("ENter c: ");
		int c=sc.nextInt();
		System.out.println("ENter d: ");
		int d=sc.nextInt();
		System.out.println("The biggest num is: " +getBig(getBig(a,b), getBig(c,d)));
	}
	
	public static int getBig(int a, int b) {
       return a>b?a:b;
   }
}