package Program_Practice;

import java.util.Scanner;

public class LCM2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	      System.out.println("enter 1st num");
		  int x=sc.nextInt();
		  System.out.println("enter 2nd num");
		  int y=sc.nextInt();
		  System.out.println("enter 3rd num");
		  int z=sc.nextInt();
		  printLCM(x,y,z);
	}
	public static void printLCM(int a, int b, int c) {
		
		int big= (a>b)?(a>c?a:c):(b>c?b:c);
		//int big=Math.max(Math.max(a,b),c);
		
    	for(int i=big;;i+=big) {
    		if(i%a==0 && i%b==0 && i%c==0) {
    			System.out.println("Lcm is :"+i);
    			break;
    		}
    	}
    }
}
