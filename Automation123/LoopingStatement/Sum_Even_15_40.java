package LoopingStatement;
public class Sum_Even_15_40 {
	public static void main(String[] args) {
          int i=15;
          int sum=0;
          while(i<=40) {
        	  if(i%2==0) {
        		  sum=sum+i;
        	  }
        	  i++;
          }
          System.out.println("sum of natural num: "+sum);
	}

}
