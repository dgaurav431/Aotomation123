package Number_Programming;

import java.util.Scanner;

public class Decimal_Hexa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int n=sc.nextInt();
		System.out.println(getHexa(n));
}
	public static String getHexa(int n){
		String hex = " ";
		while(n>0)
		{
			int rem =n%16;
			if(rem<=9) {
				hex = rem+hex;
			}
			else {
				hex= (char)(rem+87) + hex;
			}
				n= n/16;
		}	
		return hex;		
		}
	}
