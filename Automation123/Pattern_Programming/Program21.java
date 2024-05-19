package Pattern_Programming;
import java.util.Scanner;
public class Program21 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		System.out.println("ENter n: ");
		int n=sc.nextInt();	
		printPattern(n);
	}
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n/2+1)
					System.out.print("@  ");
				else
					System.out.print("*  ");
			}
			System.out.println();
		}

	}
}
