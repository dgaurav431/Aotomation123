package ConditionalStatement;

import java.util.Scanner;

public class ListOfOperation2 {

	public static void main(String[] args) {
        System.out.println("start of the program");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st no");
		int n1= sc.nextInt();
		
		System.out.println("Enter 2nd no");
		int n2= sc.nextInt();
		
		System.out.println("List of operation:");
		System.out.println("Press + for add");
		System.out.println("Press - for sub");
		System.out.println("Press * for mul");
		System.out.println("Press / for div");
		char choice= sc.next().charAt(0);
		
		if (choice=='+') {
			int sum= n1 + n2;
			System.out.println("sum of two no:" + sum);	
		}
		else if (choice=='-') {
			int sub= n1-n2;
			System.out.println("sub of two no:" + sub);
		}
			
		else if (choice=='*') {
			int mul= n1*n2;
			System.out.println("mul of two no:" + mul);
		}
		else if (choice =='/'){
			int div= n1/n2;
			System.out.println("div of two no:" + div);
		}
		else {
			System.out.println("please enter valid data");
		}
		System.out.println("end of the program");
		sc.close();
		}
	}


