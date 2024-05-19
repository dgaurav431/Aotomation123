package Number_Programming;

import java.util.Scanner;

public class Shift_Zero_One {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		shiftDigit(n);
	}
	public static void shiftDigit(int n){
		String result="";
		while(n>0)
		{
			int rem=n%10;
			if(rem==0)
				result=rem+result;
			else if(rem==1)
				result=result+rem;
			n=n/10;
		}
		System.out.println("The result is: "+result);
	}
}
