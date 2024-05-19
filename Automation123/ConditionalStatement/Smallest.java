package ConditionalStatement;
import java.util.Scanner;
public class Smallest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter four numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int s1= n1<n2?n1:n2;
		int s2= s1<n3?s1:n3;
		int smallest= s2<n4?s2:n4;
	    System.out.println("smallest no is: " + smallest);
	}

}
