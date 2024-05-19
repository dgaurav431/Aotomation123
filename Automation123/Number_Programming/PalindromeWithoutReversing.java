package Number_Programming;

import java.util.Scanner;

public class PalindromeWithoutReversing {

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
		int count=0;		int a=n;	int p=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		int x=count-1;
		int i=1;
		while(i<=count/2)
		{
			int r=a%10;
			int l=(int)(p/Math.pow(10, x))%10;
			if(r!=l)
			{
				return false;
			}
			a=a/10;		x--;		i++;
		}
		return true;
	}
}
