package LoopingStatement;
public class Factorial_EachNo {
	public static void main(String[] args) {
      int start=1;
      int end=15;
      int num=start;
      while(num<=end) {
    	  int product=1;
    	  int i=1;
    	  while(i<=num) {
    		  product=product*i;
    		  i++;
    	  }
    	 System.out.println(num+ "!=" + product); 
    	 num++;
      }
	}
}
