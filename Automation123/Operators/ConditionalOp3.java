package Operators;

public class ConditionalOp3 {

	public static void main(String[] args) {

		int a=20;
		int b=30;
		int c=40;
		
		int s= (a<b ? a:b);
		int smallest= (s<c ? s:c);
		System.out.println("smallest no is:" + smallest);
		
	}

}
