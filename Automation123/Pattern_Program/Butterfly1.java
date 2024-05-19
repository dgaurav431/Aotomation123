package Pattern_Program;
import java.util.Scanner;
public class Butterfly1 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();	
		printPattern(n);
	}
	public static void printPattern(int n)
	{
		if(n%2==0)
		{
			System.out.println("Pattern is not Possible for even valiue of n");
		}
		else
		{
		int st_star=1; int end_star=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=st_star || j>=end_star)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if(i<n/2+1){
				st_star++;		end_star--; }
			else{
				st_star--;		end_star++; }
			System.out.println();
		}
	  }
	}
}
