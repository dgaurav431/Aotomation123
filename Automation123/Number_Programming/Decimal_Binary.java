package Number_Programming;

import java.util.Scanner;

public class Decimal_Binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		System.out.println(getBinary(n));
	}
	
	public static String getBinary(int n){
		String bin="";
		while(n>0)
		{
			int rem=n%2;
			bin=rem+bin;
			n=n/2;
		}
		return bin;
		
	}
}
