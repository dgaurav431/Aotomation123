package LogicalStatement;
public class Factorial_EachDigit {
	public static void main(String[] args) {
        int n=5387;
        while(n>0) {
        	int fact=1;
        	int rem=n%10;
        	int i=1;
        	while(i<=rem) {
        		fact=fact*i;
        		i++;
        		}
        	System.out.println(rem+ "!="+fact);
        	n=n/10;
        	}
	}

}
