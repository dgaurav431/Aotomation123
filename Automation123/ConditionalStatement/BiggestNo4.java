package ConditionalStatement;
import java.util.Scanner;
public class BiggestNo4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a>b && a>c && a>d) {
		System.out.println("biggest number is :" + a);
		}
		else if(b>c && b>d) {
			System.out.println("biggest number is :" + b);
		}
		else if(c>d) {
				System.out.println("biggest number is :" + c);
		}else {
			System.out.println("biggest no is :" +d);
		}
		sc.close();
}
}
