package ConditionalStatement;
import java.util.Scanner;
public class Angle_Of_Triangle {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("angle of a triangle");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		if( (a+b+c==180) && (a>0 && b>0 && c>0) ) {
			System.out.println("valid triangle angle ");
		}
		else {
			System.out.println("invalid triangle angle ");
		}
	}

}
