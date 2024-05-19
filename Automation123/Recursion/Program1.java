package Recursion;

public class Program1 {
	public static void main(String[] args) {
		System.out.println("Main method starts");
		test();
		System.out.println("Main method ends");
	}
	public static void test()
	{
		System.out.println("This is test method");
		test();
	}
}
