package ConditionalStatement;

import java.util.Scanner;

public class Last_Even_Odd {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter a no");
		int num= s.nextInt();
		int lastDigit= num%10;
		
		if(lastDigit%2==0 || lastDigit==0)
		{
		System.out.println(lastDigit + ":last digit is even");
		}
		else {
		System.out.println(lastDigit + ":last digit is odd");
	}
		s.close();
	}

}