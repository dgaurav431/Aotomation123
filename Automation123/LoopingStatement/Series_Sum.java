package LoopingStatement;
public class Series_Sum {
	public static void main(String[] args) {
		int i=1;
	       double sum=0;
	       while(i<=5) {
	     	  sum=sum+(1.0/i);
	     	 i++;
	       }
	       System.out.println("sum of reciprocal of natural num is: "+sum);
	}
}
