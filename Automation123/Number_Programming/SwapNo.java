package Number_Programming;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=67;
		int b=51;
		Swap(a,b);
	}
	public static void Swap(int a, int b)
	{
		System.out.println("Original a is: "+a);
		System.out.println("Original b is: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped a is: "+a);
		System.out.println("Swapped b is: "+b);
		
	}
}
