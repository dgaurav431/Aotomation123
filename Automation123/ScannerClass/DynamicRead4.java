package ScannerClass;

import java.util.Scanner;

public class DynamicRead4 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a no");
		int n1= s.nextInt();
		
		boolean evenOrPositive= (n1>=0 && n1%2==0);
		
		System.out.println(evenOrPositive);
		
		s.close();
	}

		}
