package Static_NonStatic;

public class Employ {
	static int x=12;
	int y=30;
	public static void test()
	{
		System.out.println("This is static test method");
		System.out.println(x);
		demo();
		Employ e1=new Employ();
		System.out.println(e1.y);
		e1.run();
	}
	public static void demo()
	{
		System.out.println("This is static demo method");
	}
	public void start()
	{
		System.out.println("This is non-static start method");
		System.out.println(y);
		run();
		System.out.println(x);
		demo();
	}
	public void run()
	{
		System.out.println("This is non-static run method");
	}
	public static void main(String[] args)
	{
		test();
		System.out.println("=====================");
		Employ e1=new Employ();
		e1.start();
	}
}
