package LoopingStatement;

import java.util.Scanner;

public class WhileEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of main");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter starting point");
		int start= sc.nextInt();
		int count=0;
		System.out.println("Enter ending point");
		int end= sc.nextInt();
		
		while (start <= end) {
			if (start %2 ==0) {
		System.out.println(start);
		count++;
			}
			start++;
	}
		System.out.println("count of above no is:" + count);
		System.out.println("End of main");
		sc.close();
	}
}
