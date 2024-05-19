package LogicalStatement;
public class Print_EvenDigit {
	public static void main(String[] args) {
		System.out.println("each digit is: ");
        long n=123468246l;
        int count=0;
        while(n>0) {
        	long rem=n%10;
        	if(rem%2==0) {
        		count++;
        		System.out.println(rem);
        	}
        	n=n/10;
        	}
        System.out.println("count is: "+count);
	}
}
