package Operators;

public class ConditionalOp {

	public static void main(String[] args) {

		int n1= 172;
		System.out.println(n1%2==0 ? "Even" : "Odd");
		
		int n2= 15;
		System.out.println(n2%3==0 && n2%5==0 ? "yes" : "no");
		
		int n3= 15;
		System.out.println(n3>0 ? "positive" : "negative");
		
		int n4= 10;
		int n5= 15;
		System.out.println(n5>n4 ? "largest" : "smallest");
		
	}

}
