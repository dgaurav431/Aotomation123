package Methods;

public class Method_Calling3 {

	public static void m1(int i) {
		System.out.println(demo(i,60));
	}
	public static char test(int i, int j) {
		System.out.println("Hello Java Class");
		return 97;
	}
	public static void main(String[] args) {
		System.out.println("Start of main");
		char ch= 'A';
		m1(ch);
		test (ch + 5, 20);
		demo(10, 20);
		System.out.println("End of main");
	}
		public static String demo(int i, int j) {
			System.out.println(i + j);
			return "" + j + i + "" + test(i,j);
		}
	}


