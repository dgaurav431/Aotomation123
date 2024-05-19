package ScannerClass;

import java.util.Scanner;

public class DynamicRead2 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n1 =s.nextInt();
		
		boolean lastDigitSeven= (n1%10==7);
		System.out.println("Is last digit 7");
		System.out.println(lastDigitSeven);

		s.close();
	}

}
