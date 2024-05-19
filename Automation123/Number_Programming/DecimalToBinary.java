package Number_Programming;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		getBinary(n);
	}
	public static void getBinary(int n){
		String bin="";
		while(n>0)
		{
			int rem=n%2;
			bin=rem+bin;
			n=n/2;
		}
		System.out.println("The Binary value is: "+bin);
	}
}
