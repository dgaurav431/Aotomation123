package Methods;

public class Reverse_Num {

	public static void main(String[] args) {
      reverseNumber();
	}
public static void reverseNumber() {
	int n=54321;
    int rev=0;
    while(n>0) {
 	   int rem=n%10;
 	   rev=rev*10+rem;
 	   n=n/10;
    }
    System.out.println("reverse of num is: "+rev);
}
}
