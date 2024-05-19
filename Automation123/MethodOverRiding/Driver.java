package MethodOverRiding;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char x;
		do {
			Shape.selectShape();
			System.out.println("Press Y/y to continue or any other chara. to stop");
			x=sc.next().charAt(0);
		}while(x=='Y' || x=='y');
		System.out.println("Thank You Program is completed!!");
	}
}
