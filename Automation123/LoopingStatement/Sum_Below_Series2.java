package LoopingStatement;
public class Sum_Below_Series2 {
	public static void main(String[] args) {
		int i=1;
	      double sum=0;
	      while(i<=100) {
	    	  sum= sum+(1.0/i*i);
	    	  i++;
	      }
	      System.out.println("sum of below num is: "+sum);
	}

}
