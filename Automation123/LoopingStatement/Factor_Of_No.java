package LoopingStatement;
import java.util.Scanner;
public class Factor_Of_No {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter a num");
	       int n=sc.nextInt();
	       int i=1;
	       int count=0;
	       int sum=0;
	       while(i<=n) {
	    	 if(n%i==0) {
	    		 System.out.println(i);
	    		 count++;
	    		 sum=sum+i;
	    	 }
	    	   i++;
	       }
	       System.out.println("total count is: "+count);
	       System.out.println("sum of factorial is:"+sum);
	    } 
	}

