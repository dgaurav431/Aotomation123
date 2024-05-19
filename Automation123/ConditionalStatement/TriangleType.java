package ConditionalStatement;
import java.util.Scanner;
public class TriangleType {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("side of a triangle");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		if( (a+b+c==180) && (a>0 && b>0 && c>0) ) {
			if(a==b && a==c) {
				System.out.println("triangle is equilateral");
			}
			else if(a!=b && a!=c) {
				System.out.println("triangle is scalene");
			}
			else{
				System.out.println("triangle is isosceles");
			}
		}
	}

}
