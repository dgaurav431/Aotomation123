package LogicalStatement;
import java.util.Scanner;
public class Prime_Range_UD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter a num");
		int num=sc.nextInt();
		int x=num;
		int prCount=0;
		for(int a=2;a<=x;a++) {
			int b=a;
			int count=0;
					  
			for(int i=2;i<=b/2;i++) {
			if(b%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(b);
			prCount++;
		}			
	}
			System.out.println("total prime num in range is: "+prCount);}
}
