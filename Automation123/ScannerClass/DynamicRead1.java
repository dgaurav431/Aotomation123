package ScannerClass;

import java.util.Scanner;

public class DynamicRead1 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		
		
		System.out.println("Enter first program");
		int n1 =s.nextInt();
		
		System.out.println("Enter second program");
		int n2= s.nextInt();
		
		System.out.println("first no:" + n1 + " /n second no:" + n2);
		
		System.out.println("sum:" + (n1+n2));
		
	s.close();
	}

}
