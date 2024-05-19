package Exception_Handling;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
		System.out.println("This is program1");
		System.out.println("Today is Friday");
		System.out.println(12+40*5);
		System.out.println(10+50*5+20);
		try {
			System.out.println("Try block starts");
			Calculator.divide(a, b);
			System.out.println("Inside try block");
			System.out.println("Try block Ends!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("===============");
			e.printStackTrace();
			System.out.println("================");
			System.out.println(a+"/"+b+"= Infinity");
		}
		System.out.println(30+40*5);
		System.out.println(12+20*5);
		System.out.println("Program is Completed");
	}

}
