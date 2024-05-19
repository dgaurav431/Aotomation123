package Number_Programming;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=5;
		int b=32;
		int c=4;
		int d=2;
		System.out.println((a*b)/(c*d));
		System.out.println("ENter total members: ");
		int n=sc.nextInt();
		System.out.println("ENter the selection at a time: ");
		int r=sc.nextInt();
		getTotalNumberOfSelection(n,r);
	}
	public static void getTotalNumberOfSelection(int n, int r)
	{
		int comb=1;
		for(int i=0;i<n-r;i++)
		{
			comb=(comb*(n-i))/(i+1);
		}
		System.out.println("Total Possible Selection is: "+comb);
	}

}
