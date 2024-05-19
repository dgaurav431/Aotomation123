package Recursion;

public class Program3 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println(test());
		System.out.println("Main ENds!");
	}
	public static String test()
	{
		System.out.println("This is Test method");
		return "Hi "+test();
	}
}
