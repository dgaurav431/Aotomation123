package LoopingStatement;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value");
		int a=sc.nextInt();
		System.out.println("Enter power value");
		int b=sc.nextInt();
		int power=1;
		int i=1;
		while(i<=b) {
			power=power*a;
					i++;
		}
		System.out.println(a + " to power " + b+ " is: " +power);
	}
}
