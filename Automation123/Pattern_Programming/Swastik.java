package Pattern_Programming;
import java.util.Scanner;
public class Swastik {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		System.out.println("ENter n: ");
		int n=sc.nextInt();	
		printPattern(n);
	}
	public static void printPattern(int n)
	{
		int mid=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==mid || j==mid || i==1 && j>mid || i==n && j<mid ||
							j==1 && i<mid || j==n && i>mid)
					System.out.print("*  ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}
