package LoopingStatement;
import java.util.Scanner;
public class LoopPrime {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Prime no is:");
	int start=5;
	int end=30;
	for (;start<=end;start++) {
		int num= start;
		if(num>=2) {
			int countFactor=0;
			for(int i=2;i<=num/2; i++) {
				if (num%i==0) {
					countFactor++;
					break;
				}
			}
			if(countFactor==0) {
				System.out.println(num);
			}
		}
	}
	  sc.close();
	}
}
