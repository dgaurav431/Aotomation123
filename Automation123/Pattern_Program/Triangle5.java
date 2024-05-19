package Pattern_Program;
import java.util.Scanner;
public class Triangle5 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();		
		printPattern(n);
	}
	public static void printPattern(int n)
	{
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=space)
					System.out.print("  ");
				else
					System.out.print("* ");
			}	
			space--;
			System.out.println();
		}
	}
}
