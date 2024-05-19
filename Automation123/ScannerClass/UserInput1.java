package ScannerClass;

import java.util.Scanner;

public class UserInput1 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter student name");
		String name= s.nextLine();
		
		System.out.println("Enter student age");
		byte age= s.nextByte();
		
		System.out.println("Enter student phone no");
		long phoneNo= s.nextLong();
		s.nextLine();
		
		System.out.println("Enter student email");
		String email= s.nextLine();
		
		System.out.println("Enter student roll no");
		int rollNo= s.nextInt();
		s.nextLine();
		
		System.out.println("Enter student address");
		String address= s.nextLine();
		
		System.out.println("Enter student aadhar");
		long aadhar= s.nextLong();
		s.nextLine();
		
		System.out.println("Enter student grade");
		char ch= s.next().charAt(0);
		System.out.println("char is: " + ch);
				
		System.out.println("Enter student percent");
		float percent= s.nextFloat();
		s.nextLine();
		
		System.out.println("Enter student blood group");
		String bloodGroup= s.nextLine();
		
		
		s.close();
		
	}

}
