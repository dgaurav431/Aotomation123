package LoopingStatement;
import java.util.Scanner;
public class PowerA_B {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter two num");
	       int a=sc.nextInt();
	       int b=sc.nextInt();
	       int pow=1;
	       int i=1;
	       while(i<=b) {
	    	   pow=pow*a;
	    	   i++;
	       }
	       System.out.println(a+ " to power " +b +" is: "+pow);   
	}
}
