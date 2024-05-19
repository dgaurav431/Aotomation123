package Methods;

public class Factorial_EachDigit {

	public static void main(String[] args) {

		factorialEachDigit();
	}
public static void factorialEachDigit() {
	int n=5423;
	while(n>0) {
		int rem=n%10;
		int fact=1;
		int i=1;
		while(i<=rem) {
		fact=fact*i;
		i++;
	}
	System.out.println(rem+"!=" +fact);
	   n=n/10;
    }
  }
}
