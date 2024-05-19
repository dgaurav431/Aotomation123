package Number_Programming;

import java.util.Scanner;

public class PalindromeByReversing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		if(checkPalindrome(n))
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}
	public static boolean checkPalindrome(int n)
	{
		int rev=0;		int a=n;
		while(n>0)
		{
			int rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
		return  rev==a?true:false;
		/*if(rev==a)
			return true;
		else
			return false;*/
	}
}
