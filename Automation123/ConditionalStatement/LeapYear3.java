package ConditionalStatement;
import java.util.Scanner;
public class LeapYear3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year");
		int year= sc.nextInt();
		if(year !=100) {
			System.out.println("it is a normal year");
			if(year%4==0) {
				System.out.println("it is a leap year");
			}
			else {
				System.out.println("it not not a leap year");
			}
		}
		else {
			System.out.println("it is a century year");
			if(year%400==0) {
				System.out.println("it is a leap year");
			}
			else {
				System.out.println("it is not a leap year");
			}
		}
	}

}
