package Methods;

import java.util.Scanner;

public class LCM {
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
	int count=0;
	for(int i=1;;i++) {
		count++;
		System.out.println("loop number is :"+i);
		if(i%a==0 && i%b==0 && i%c==0) {
			System.out.println("Lcm is :"+i);
			break;
		}
	}
}
}
