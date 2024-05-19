package MethodOverloading;

public class Calculator {

		public static void add(int x, int y)
		{
			System.out.println("int, int arg method");
			System.out.println("Sum is: "+(x+y));
		}
		public static void add(int x, double y)
		{
			System.out.println("int, double arg method");
			System.out.println("Sum is: "+(x+y));
		}
		public static void add(double x, int y)
		{
			System.out.println("double, int arg method");
			System.out.println("Sum is: "+(x+y));
		}
		public static void add(double x, double y)
		{
			System.out.println("double, double arg method");
			System.out.println("Sum is: "+(x+y));
		}
		public static void add(int x, int y, int z)
		{
			System.out.println("int, int , int arg method");
			System.out.println("Sum is: "+(x+y+z));
		}
		public static void add(int x, int y, double z)
		{
			System.out.println("int, int , double arg method");
			System.out.println("Sum is: "+(x+y+z));
		}
		public static void add(double x, int y, int z)
		{
			System.out.println("double, int , int arg method");
			System.out.println("Sum is: "+(x+y+z));
		}
}
