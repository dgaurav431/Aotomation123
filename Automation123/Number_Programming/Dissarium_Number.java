package Number_Programming;

import java.util.Scanner;

public class Dissarium_Number {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		if(checkDissarium(n))
		{
			System.out.println(n+" is a Dissarium number");
		}
		else
		{
			System.out.println(n+" is not a Dissarium number");
		}
	}
	public static boolean checkDissarium(int n)
	{
		int sum=0;
		int a=n;
		int x=countDigit(n);
		while(n>0)
		{
			int rem=n%10;
			sum=sum+power(rem, x);
			x--;
			n=n/10;
		}
		return sum==a?true:false;
	}
	
	public static int power(int a, int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		return pow;
	}
	
	public static int countDigit(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
}
