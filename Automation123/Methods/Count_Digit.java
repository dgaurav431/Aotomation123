package Methods;

public class Count_Digit {

	public static void main(String[] args) {

		countDigit();
	}
public static void countDigit() {
	int n=5827;
	int count=0;
	while(n>0) {
		count++;
		n=n/10;
	}
	System.out.println("total count is: "+count);
}
}
