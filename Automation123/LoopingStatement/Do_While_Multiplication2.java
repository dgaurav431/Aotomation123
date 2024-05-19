package LoopingStatement;
import java.util.Scanner;
public class Do_While_Multiplication2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int num= sc.nextInt();
		System.out.println("Multiplication table of " + num);
		int i=1;
		do {
			System.out.println(num + "*" + i + "=" + num*i);
			i++;
		}while(i<=10);
		sc.close();
	}
}
