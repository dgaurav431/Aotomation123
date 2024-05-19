package Operators;

public class ArithmeticOp3 {

	public static void main(String[] args) {

		int a=0;
		int b=6;
		int c= a+b;
		c= a++ + b++;
		a++;
		++a;
		b++;
		++b;
		b= c+a;
		c= a+b;
		
		System.out.println(c+a);
		System.out.println(b++);
		System.out.println(++c);
		System.out.println(a+b+c);
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(c++);
		System.out.println(a+b);
		System.out.println(b+c);
		System.out.println(c+a++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
