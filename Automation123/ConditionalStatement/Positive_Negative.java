package ConditionalStatement;
import java.util.Scanner;
public class Positive_Negative {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a no");
	int num= sc.nextInt();
	if(num>0) {
		System.out.println("Num is positive");
	}
	else if(num<0) {
		System.out.println("Num is negative");
	}
	else if(num==0) {
		System.out.println("Num is zero");
	}
	sc.close();
}
}
