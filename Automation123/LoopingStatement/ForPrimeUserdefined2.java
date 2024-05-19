package LoopingStatement;

import java.util.Scanner;

public class ForPrimeUserdefined2 {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
             System.out.println("Enter two no");
             int start= sc.nextInt();
             int end= sc.nextInt();
        int num=start;
             if(start<0) {
            	 System.out.println("num is not prime");
             }
             int count=0;
             for(num=2; num<=end/2; num++) {
            	 if(end%2==0) {
            		 System.out.println(num);
            	     count++;
            	 }
            	
             }if(count==2) {
            	 System.out.println("num is prime");
             }
             sc.close();
             }
}
