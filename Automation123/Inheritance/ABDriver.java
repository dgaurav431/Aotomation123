package Inheritance;

public class ABDriver {

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.x);
		System.out.println("======");
		B b=new B();
		b.test();
	}
}
