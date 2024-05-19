package LoopingStatement;
public class Sum_Series2 {
	public static void main(String[] args) {
		int i=1;
	       double sum=0;
	       while(i<=5) {
	     	  sum=sum+(1.0/i*i);
	     	 i++;
	       }
	       System.out.println("sum of square of reciprocal of natural num is: "+sum);
	}
}
