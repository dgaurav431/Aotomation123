package LoopingStatement;

public class LoopPrime2 {

	public static void main(String[] args) {
		int num= 11;
		if(num>=2) {
			int countFactor=0;
		for (int i=2; i<=num/2; i++) {
			if (num%i==0) {
			countFactor++;
			break;
		
		}
	} if (countFactor==0) {
       System.out.println("prime");
	}
	}
	}
	}
