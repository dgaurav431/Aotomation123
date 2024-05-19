package LoopingStatement;
import java.util.Scanner;
public class Factorial_of_No {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a num");
       int n=sc.nextInt();
       int fact=1;
       int i=1;
       while(i<=n) {
    	   fact=fact*i;
    	   i++;
       }
       System.out.println(n +"!=" +fact);
	}
}
