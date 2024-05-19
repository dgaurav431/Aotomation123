package Number_Programming;

import java.util.Scanner;

public class Print_Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		System.out.println("Right to Left digit is:=========");
		printRightToLeft(n);
		System.out.println("\nLeft to Right digit is:=========");
		printLeftToRight(n);
	}
	public static void printRightToLeft(int n)
	{
		while(n>0)
		{
			int rem=n%10;
			System.out.print(rem+"  ");
			n=n/10;
		}
	}
	public static void printLeftToRight(int n)
	{
		int a=n;		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		int x=count-1;
		while(x>=0)
		{
			int digit=(int)(a/Math.pow(10, x))%10;
			System.out.print(digit+"  ");
			x--;
		}
	}
}
