package Recursion;

public class Print_Number2 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		printNum(1);
		System.out.println("Main Ends");
	}
	public static void printNum(int n)
	{
		if(n<=5) {
			System.out.println(n);
			printNum(n+1);
		}
		System.out.println("This is Outside if");
		System.out.println(n);
	}
	
}
