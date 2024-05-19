package Recursion;

public class Fibonacci {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
			System.out.print(getFib(i)+"  ");
	}
	public static int getFib(int n)
	{
		if(n==1)
			return 0;
		else if(n==2 || n==3)
			return 1;
		else
		return getFib(n-2)+getFib(n-1);
	}

}
