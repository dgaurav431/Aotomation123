package Number_Programming;

import java.util.Scanner;

public class Fascinating_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int x=sc.nextInt();
		if(isFascinating(x))
			System.out.println("It is a Fascinating number");
		else
			System.out.println("It is Not a Fascinating number");
		
	}
	public static boolean isFascinating(int n)
	{
		String s1=n+""+n*2+n*3;
		for(char c='1';c<='9';c++)
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(c==s1.charAt(i))
					count++;
			}
			if(count==0 || count>1)
				return false;
		}
		return true;
	}
}
