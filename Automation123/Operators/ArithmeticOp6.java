package Operators;

public class ArithmeticOp6 {

	public static void main(String[] args) {

		double i= 4.5;
		int j=(byte)i;
		System.out.println(j);
		j= j++;
		j= ++j;
		System.out.println(j++);
		System.out.println(i++);
		
		int b=2;
		int a=1;
		 a= a++ + ++a + a++;
		 b= a++ + b++ + --b;
		 
		 System.out.println(a);
		 System.out.println(++a);
		 System.out.println(b);
		 System.out.println(b--);
		 System.out.println(--a);
		 System.out.println(b++);
		 System.out.println(a+b);
		 System.out.println(--a + --b);
		
	}

}
