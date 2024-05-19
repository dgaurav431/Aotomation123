package LogicalStatement;
public class Print_Digit_Greater5 {
	public static void main(String[] args) {
		System.out.println("output is: ");
        int n=87543;
        int count=0;
        while(n>0) {
        	int rem=n%10;
        	if(rem>=5) {
        		System.out.println(rem);
        		count++;
        	}
        	n=n/10;
        }
        System.out.println("count is: "+count);
	}
}
