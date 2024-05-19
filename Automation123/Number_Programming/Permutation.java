package Number_Programming;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter total seats: ");
		int n=sc.nextInt();
		System.out.println("ENter total boys: ");
		int b=sc.nextInt();
		getTotalNumberOfArrangements(n,b);
	}
	public static void getTotalNumberOfArrangements(int n, int b)
	{
		int arr=1;
		for(int i=0;i<b;i++)
		{
			arr=arr*(n-i);
		}
		System.out.println("Total Possible arrangements is: "+arr);
	}
}
