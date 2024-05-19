package ConditionalStatement;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a no");
      int num= sc.nextInt();
      int numMultiple = num%15;
      int numEven = num%2;
      if (num>0) {
    	  if (numMultiple==0) {
    		  System.out.println("num is multiple of 15");
    	  }
    	  else 
    		  {
    		  System.out.println("num is not multiple of 15");
    		  }
      }
      if (num<0) {
    	  if (numEven==0) {
    		  System.out.println("num is even");
    	  }
    	  else
    	  {
    		  System.out.println("num is odd");
    	  }
      }
      sc.close();
	}

}
