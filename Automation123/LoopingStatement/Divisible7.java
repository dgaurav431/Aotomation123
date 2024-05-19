package LoopingStatement;
public class Divisible7 {
	public static void main(String[] args) {
      
		System.out.println("print numbers");
		int i=1;
		int count=0;
		while(i<=100) {
			if(i%7==0) {
				System.out.println(i);
				count ++;
			}
			i++;
		}
		System.out.println("count of num is: "+count);
	}
}
