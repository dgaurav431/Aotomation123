package Pattern_Program;
import java.util.Scanner;
public class Diamond1 {
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
		int star=1; int space=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			if(i<n/2+1){
				star+=2;		space--; }
			else{
				star-=2;		space++; }
			System.out.println();
		}
	  }
	}
}
