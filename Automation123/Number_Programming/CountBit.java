package Number_Programming;

import java.util.Scanner;

public class CountBit {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num...");
		int n= sc.nextInt();
		countBits(n);
	}
		public static void countBits(int n) {
			int count=0;
			while(n>0) {
              count++;
              n=n/2;
		}
			System.out.println("Total bits are: "+count);
	}

}
