package Inheritance;

public class B extends A {

	int x=53;
	int q=61;
	
	public void test()
	{
		int x=43;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(q);
		System.out.println(this.q);
		System.out.println(p);
		System.out.println(this.p);
		System.out.println(super.p);
		
	}
}
