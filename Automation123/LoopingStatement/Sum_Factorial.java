package LoopingStatement;
public class Sum_Factorial {
	public static void main(String[] args) {
		int start=1;
	      int end=5;
	      int num=start;
	      int sum=0;
	      while(num<=end) {
	    	  int product=1;
	    	  int i=1;
	    	  while(i<=num) {
	    		  product=product*i;
	    		  i++;
	    	  }
	    	 System.out.println(num+ "!=" + product); 
	    	 sum=sum+product;
	    	 num++;
	      }
	      System.out.println("sum of factorial is: "+sum);
	}

}
