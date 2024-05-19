package LoopingStatement;

import java.util.Scanner;

public class WhileCountEndWith3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of main");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter starting point");
		int start= sc.nextInt();
		System.out.println("Enter ending point");
		int end= sc.nextInt();
		int count=0;
		while (start<=end) {
		if (start%10==3) {
		System.out.println(start);
		count++;
		}
		start++;
		}
		System.out.println("count of nos which ends with 3 is:" + count);
		sc.close();
	}

}