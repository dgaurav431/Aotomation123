package ConditionalStatement;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
				
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any input");
		System.out.println("press 1 for Mon");
		System.out.println("press 2 for Tue");
		System.out.println("press 3 for Wed");
		System.out.println("press 4 for Thu");
		System.out.println("press 5 for Fri");
		System.out.println("press 6 for Sat");
		System.out.println("press 7 for Sun");
		int input= sc.nextInt();
		switch (input) {
		
		case 1:
			System.out.println("Weekdays");
			break;
		case 2:
			System.out.println("Weekdays");
			break;
		case 3:
			System.out.println("Weekdays");
			break;
		case 4:
			System.out.println("Weekdays");
			break;
		case 5:
			System.out.println("Weekdays");
			break;
		case 6:
			System.out.println("Weekend");
			break;
		case 7:
			System.out.println("Weekend");
			break;
			default:
				System.out.println("please enter valid input");
	}
		sc.close();
}
}