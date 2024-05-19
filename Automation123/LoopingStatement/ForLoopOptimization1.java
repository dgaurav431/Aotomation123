package LoopingStatement;

public class ForLoopOptimization1 {

	public static void main(String[] args) {
		int num=17;
		int count=0;
		int i=2;
		for(;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
	if(count ==0) {
		System.out.println("prime");
	}else {
		System.out.println("not prime");
	}
			
}
}
