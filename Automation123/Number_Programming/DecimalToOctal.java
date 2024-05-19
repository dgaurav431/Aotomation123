package Number_Programming;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		getOctal(n);
	}
	public static void getOctal(int n){
		String oct="";
		while(n>0)
		{
			int rem=n%8;
			oct=rem+oct;
			n=n/8;
		}
		System.out.println("The Ocatl value is: "+oct);
	}
}
