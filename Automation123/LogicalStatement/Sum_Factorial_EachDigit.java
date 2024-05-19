package LogicalStatement;
public class Sum_Factorial_EachDigit {
	public static void main(String[] args) {
      int n=3241;
      int sum=0;
      while(n>0) {
    	  int fact=1;
    	  int rem=n%10;    	  
    	  int i=1;
    	  while(i<=rem) {
    		  fact=fact*i;
    		  i++;
    	  }
    	  System.out.println(rem+ "!="+fact);
    	  sum=sum+fact;
    	  n=n/10;
      }
      System.out.println("sum is: "+sum);
	}
}
