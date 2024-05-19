package ConditionalStatement;
import java.util.Scanner;
public class Check_3DigitNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		if(n>=100 && n<=999) {
			System.out.println("it is a 3 digit no");
			if(n%7==0) {
				System.out.println("divisible by 7");
			}
			else {
				System.out.println("not divisible by 7");
			}
		}
		else {
			System.out.println("it not not a 3 digit no");
			if(n%12==0) {
				System.out.println("it is divisible by 12");
			}
			else {
				System.out.println("it is not divisible by 12");
			}
		}
	}

}
