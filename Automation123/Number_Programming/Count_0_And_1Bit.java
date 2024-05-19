package Number_Programming;

import java.util.Scanner;

public class Count_0_And_1Bit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num...");
		int n= sc.nextInt();
		countBits(n);
	}
	
	public static void countBits(int n) {
		int zero_count=0;
		int one_count=0;
		while(n>0) {
          int rem= n%2;
          if(rem==1) {
        	  one_count++;
          }
          else
        	  zero_count++;
          n=n/2;
          }    
		System.out.println("Total 0 bits are: "+zero_count);
		System.out.println("Total 1 bits are: "+one_count);
	}

}
