package LoopingStatement;

import java.util.Scanner;

public class WhileEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of main");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter starting point");
		int start= sc.nextInt();
		System.out.println("Enter ending point");
		int sum=0;
		int end= sc.nextInt();
		 while (start<=end) {
			 if(start%2==0) {
				sum= sum + start;
				 System.out.println(sum);
		 }
			 start++;
	}
		 System.out.println("Sum is:" + sum);
		 sc.close();
}
}