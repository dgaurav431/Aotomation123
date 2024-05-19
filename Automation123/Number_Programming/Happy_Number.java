package Number_Programming;

import java.util.Scanner;

public class Happy_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		if(checkHappy(n))
			System.out.println("It is a Happy Number");
		else
			System.out.println("It is not a Happy Number");
	}
	public static boolean checkHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				sum=sum+rem*rem;
				n=n/10;
			}
			n=sum;
		}
		return n==1 || n==7;
	}

}
