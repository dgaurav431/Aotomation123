package Number_Programming;

import java.util.Scanner;

public class Automorphic_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int x=sc.nextInt();
		if(isAutomorphic(x))
			System.out.println("It is an Automorphic number");
		else
			System.out.println("It is Not an Automorphic number");
		
	}
	public static boolean isAutomorphic(int n)
	{
		int sq=n*n;
		while(n>0)
		{
			if(n%10!=sq%10)
				return false;
			n=n/10;
			sq=sq/10;
		}
		return true;
	}

}
