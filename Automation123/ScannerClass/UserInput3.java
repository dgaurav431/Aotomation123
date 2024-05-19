package ScannerClass;

import java.util.Scanner;

public class UserInput3 {
	
	public static void main(String[] args) {
		
		      	Scanner s= new Scanner(System.in);
			
			System.out.println("Enter employee name");
			String name= s.nextLine();
			
			System.out.println("Enter employee company name");
			String companyName= s.nextLine();
			
			System.out.println("Enter employee age");
			byte age= s.nextByte();
			
			System.out.println("Enter employee salary");
			double salary= s.nextDouble();
			s.nextLine();
			
			System.out.println("Enter employee phone no");
			long phoneNo= s.nextLong();
			s.nextLine();
			
			System.out.println("Enter employee email");
			String email= s.nextLine();
			
			System.out.println("Enter employee position");
			String position= s.nextLine();
			
			System.out.println("Enter employee address");
			String address= s.nextLine();
			
			System.out.println("Enter employee aadhar");
			long aadhar= s.nextLong();
			s.nextLine();
			
			System.out.println("Enter employee grade");
			String grade= s.nextLine();
					
			System.out.println("Enter employee percent");
			double percent= s.nextDouble();
			s.nextLine();
			
			System.out.println("Enter employee blood group");
			String bloodGroup= s.nextLine();
			
			System.out.println("Enter employee pan");
			String pan= s.nextLine();
			
			System.out.println("Enter a char");
			char ch= s.next().charAt(0);
			System.out.println("char is:" + ch);
			s.close();
		}

	}