package LoopingStatement;
public class Sum_Of_Square_NaturalNo {
	public static void main(String[] args) {
		int i=1;
	      int sum=0;
	      while(i<=100) {
	    	  sum=sum+i*i;
	    	  i++;
	      }
	      System.out.println("sum of square of natural num is: "+sum);
	}
}
