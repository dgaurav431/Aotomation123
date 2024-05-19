package LogicalStatement;
public class Print_All_Digit {
	public static void main(String[] args) {
		System.out.println("each digit is: ");
        int n=12345;
        while(n>0) {
        	int rem=n%10;
        	System.out.println(rem);
        	n=n/10;
        }
	}
}
