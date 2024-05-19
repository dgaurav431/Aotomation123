package ConditionalStatement;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter 1st no");
		int n1= s.nextInt();
		
		System.out.println("Enter 2nd no");
		int n2= s.nextInt();
		
		if(n1>n2)
		{
			System.out.println("largest:" + n1);	
		}if(n1<n2)
		{
			System.out.println("largest:" + n2);
			s.close();
		}
		
	}

}
