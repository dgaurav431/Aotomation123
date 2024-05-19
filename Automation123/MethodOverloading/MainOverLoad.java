package MethodOverloading;

public class MainOverLoad {

	public static void main(String[] args) {
		System.out.println("main with String[]");
		main(12);
		main("abc");
	}
	public static void main(boolean args) {
		System.out.println("main with boolean arg");
	}
	public static void main(int args) {
		System.out.println("main with int arg");
	}
	public static void main(double args) {
		System.out.println("main with double arg");
	}
	public static void main(char args) {
		System.out.println("main with char arg");
	}
	public static void main(String args) {
		System.out.println("main with String arg");
	}
}
