package ScannerClass;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a no");
		byte var1= (byte)s.nextInt();
		System.out.println("var1:" + var1);
		s.nextLine();
		
		System.out.println("Enter your prog lang");
		String data1= s.nextLine();
		System.out.println("Enter data1:" + data1);
		
		
		System.out.println("Enter your prog lang");
		String data2= s.nextLine();
		System.out.println("Enter data2:" + data2);
		s.close();
	}

}
