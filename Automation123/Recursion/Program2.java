package Recursion;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("Sum is: "+sum(40, 50));
		System.out.println("Sum is: "+sum(sum(40, 50), 60));
		System.out.println("Sum is: "+sum(sum(20, 40), sum(70, 80)));
	}
	public static int sum(int a, int b)
	{
		return a+b;
	}
}
