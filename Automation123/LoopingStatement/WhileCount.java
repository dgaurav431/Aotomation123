package LoopingStatement;

import java.util.Scanner;
public class WhileCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start of main");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter starting point");
		int start= sc.nextInt();
		System.out.println("Enter ending point");
		int end= sc.nextInt();
		
		while (start <= end) {
		System.out.println(start);
		start++;
	}
		System.out.println("End of main");
	}
}
