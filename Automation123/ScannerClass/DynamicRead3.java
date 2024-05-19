package ScannerClass;

import java.util.Scanner;

public class DynamicRead3 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a no");
		int n1= s.nextInt();
		
		boolean factorOf27 = (27%n1==0);
		System.out.println(factorOf27);
		s.close();
	}

}
