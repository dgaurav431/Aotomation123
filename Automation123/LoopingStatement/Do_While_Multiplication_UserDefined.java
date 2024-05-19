package LoopingStatement;
import java.util.Scanner;
public class Do_While_Multiplication_UserDefined {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter starting num");
		int start= sc.nextInt();
		System.out.println("Enter end num");
		int end= sc.nextInt();
		do {
			int num= start;
		System.out.println("Multiplication table of " + num);
		int i=1;
		do {
			System.out.println(num + "*" + i + "=" + num*i);
			i++;
			}while(i<=10);
		System.out.println("-----------------------");
		start++;
		}while(start<=end);
											
		sc.close();
}
}