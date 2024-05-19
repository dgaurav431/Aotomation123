package LoopingStatement;
import java.util.Scanner;
public class ForPrimeUserDefined {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
             System.out.println("Enter two no");
             int start= sc.nextInt();
             int end= sc.nextInt();
             int count=0;
             int i=1;
             if(i==1)
            	 for(; start<=end; start++) {
            		 if(start%2!=0) {
            			 System.out.println(start);
            			 count++;
            		 }
            		 }
            	 if (count==0) {
            		 System.out.println("num is prime");
            	 }else {
            		 System.out.println("num is not prime");
            	 }
                }
	
             }