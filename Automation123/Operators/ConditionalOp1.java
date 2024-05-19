package Operators;

public class ConditionalOp1 {

	public static void main(String[] args) {

		int a=10;
		int b=15;
		int c=20;
		
		int s1= (a<b ? 10 : 15);
		int smallest= (s1<c ? s1 : c);
		
	System.out.println("smallest no is:" + smallest);
	}

}
