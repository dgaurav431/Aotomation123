package LoopingStatement;

import java.util.Scanner;

public class DoWhile_Palindrom {
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    
	    System.out.println("Enter a number");
	      int num= sc.nextInt();
	      int reverse=0;
	      int j=num;
	        do {
	     int i= num%10;
	     reverse=(reverse*10)+i;
	      num= num/10;
	        } while(num>0);
	      if(j==reverse) {
	    	  System.out.println("num is palindrom");
	      }
	      else {
	    	  System.out.println("num is not palindrom");
	      }
	     
	      sc.close();
}
}