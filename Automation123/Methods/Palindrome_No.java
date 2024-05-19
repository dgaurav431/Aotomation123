package Methods;

public class Palindrome_No {

	public static void main(String[] args) {
		for(int i=1000;i<=5000;i++) {
			checkPalindrome(i);
		}
	}
    public static void checkPalindrome(int n) {
    	
    	int a=n;
    	int rev=0;
    	while(n>0) {
    		int rem=n%10;
    		rev=rev*10+rem;
    		n=n/10;
    		if(rev==a) {
    			System.out.println(a);
    		}
    	}
    }
}
