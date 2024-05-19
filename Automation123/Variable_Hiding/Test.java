package Variable_Hiding;

public class Test {
static int x=12;
	
	public static void test()
	{
		System.out.println("This is static test method");
		int x=38;
		System.out.println("Local x is: "+x);
		System.out.println("Global x is: "+Test.x);
	}

	public static void main(String[] args)
	{
		test();
	}
}
