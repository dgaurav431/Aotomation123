package LoopingStatement;
import java.util.Scanner;
public class ForPrimeUserdefined3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int num= sc.nextInt();
		int count=0;
		if(num>1) {
		for(int i=2; i<=num/2; i++) {
			if(num%2==0) {
				count++;
			}
		}if(count==0) {
			System.out.println("num is prime");
		}else {
			System.out.println("num is not prime");
		}
}
		else {
			System.out.println("num is not prime");
			}
		sc.close();
		}
}