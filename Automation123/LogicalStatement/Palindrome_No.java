package LogicalStatement;
public class Palindrome_No {
	public static void main(String[] args) {
		int n=12321;
		int num=n;
	       int rev=0;
	       while(n>0) {
	    	   int rem=n%10;
	    	   rev=rev*10+rem;
	    	   n=n/10;
	       }
	       if(rev==num) {
	    	   System.out.println("it is a palindrome num");
	       }
	       else {
	    	   System.out.println("it is not a palindrome num");
	       }
	}

}
