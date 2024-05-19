package Exception_Handling;
import java.util.*;
public class Program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
		System.out.println("This is program1");
		System.out.println("Today is Friday");
		System.out.println(12+40*5);
		System.out.println(10+50*5+20);
		try {
			System.out.println("Try block starts");
			System.out.println(a+"/"+b+"= "+a/b);
			System.out.println("Inside try block");
			System.out.println("Try block Ends!!");
		}
		catch(Exception e)
		{
			System.out.println(a+"/"+b+"= Infinity");
		}
		System.out.println(30+40*5);
		System.out.println(12+20*5);
		System.out.println("Program is Completed");
	}

}
