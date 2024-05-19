package ConditionalStatement;
import java.util.Scanner;
public class RealRootOfQuadratic {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter triangle input");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d= b*b-4*a*c;
		if(d>0) {
			System.out.println("real roots are possible");
			double p= -b+ Math.sqrt(d)/(2*a);
			double q= -b- Math.sqrt(d)/(2*a);
			System.out.println("the 1st root is: "+p);
			System.out.println("the 2nd root is: "+q);
		}
		else {
			System.out.println("real roots are not possible");
		}
	}
}
