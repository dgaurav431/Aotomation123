package ScannerClass;

import java.util.Scanner;

public class UserInput4 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Start of program");
		
		System.out.println("Enter a char");
		char ch1= s.next().charAt(5);
		System.out.println("char is:" + ch1);
		
		System.out.println("Enter data1");
		float data1= s.nextFloat();
		s.nextLine();
		
		System.out.println("Enter data2");
		String data2= s.nextLine();
		
		System.out.println("Enter data3");
		long data3= s.nextLong();
		
		System.out.println("Enter data4");
		short data4= s.nextShort();
		s.nextLine();
		
		System.out.println("Enter data5");
		char ch2= s.nextLine().charAt(10);
		System.out.println("char is:" + ch2);
		
		System.out.println("Enter data6");
		double data6= s.nextDouble();
		
		System.out.println("End of program");
		s.close();
	}

}
