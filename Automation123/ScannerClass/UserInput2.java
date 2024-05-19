package ScannerClass;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter first data");
		String s1= s.next();
		
		System.out.println("Enter second data");
		String s2= s.next();
		
		System.out.println("Enter third data");
		String s3= s.next();
		s.nextLine();
		
		System.out.println("Enter all data");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s.close();
	}

}
