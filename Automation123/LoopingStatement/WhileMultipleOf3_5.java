package LoopingStatement;

import java.util.Scanner;

public class WhileMultipleOf3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of main");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter starting point");
		int start= sc.nextInt();
		System.out.println("Enter ending point");
		int end= sc.nextInt();
		
		while(start <= end) {
			if(start%3==0 && start%5==0) {
				System.out.println(start);
				
			}
			start++;
			}
		sc.close();
		}
}