package ConditionalStatement;
import java.util.Scanner;
public class ValidTriangle {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("sides of a triangle");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		if(n1+n2>n3 && n1-n2<n3) {
			System.out.println("triangle is valid");
		}
		else {
			System.out.println("triangle is not valid");
		}
	}

}
