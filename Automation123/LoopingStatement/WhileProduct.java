package LoopingStatement;

import java.util.Scanner;

public class WhileProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of main");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter starting point");
		int start= sc.nextInt();
		System.out.println("Enter ending point");
		int end= sc.nextInt();
		int product=1;
		
		
		while(start<=end) {
			product= product*start;
				System.out.println(product);
				start++;
			}
			    System.out.println("product is:" + product);
			    sc.close();
	}

}

