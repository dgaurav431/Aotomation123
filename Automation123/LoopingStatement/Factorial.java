package LoopingStatement;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int product=1;
		for(int i=1;i<=num;i++){
			product=product*i;
		}
		System.out.println("factorial is: "+product);
	}

}
