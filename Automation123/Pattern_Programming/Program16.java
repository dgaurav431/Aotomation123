package Pattern_Programming;
import java.util.Scanner;
public class Program16 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();		
		printPattern(n);
	}
	public static void printPattern(int n)
	{
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}

	}
}
