package LoopingStatement;
import java.util.Scanner;
public class WhileFactorOfNo {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int num= sc.nextInt();
	int i=1;
	int count=0;
	while (i<=num) {
	if (num%i==0) {
	System.out.println(i);
	count++;
	}
	i++;
	}
	System.out.println("all factor of above no is:" + count);
	sc.close();
}
}