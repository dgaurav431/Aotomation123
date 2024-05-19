package Recursion;

import java.util.Scanner;

public class Print_Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x=sc.nextInt();
		printTable(x,1);
	}
	public static void printTable(int n, int i)
	{
		if(i<=10)
		{
			System.out.println(n+" * "+i+" = "+n*i);
			printTable(n,i+1);
		}
	}
}
