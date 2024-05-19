package Methods;

public class Program2 {

	public static void m1() {
		System.out.println("m1 0 args method");
	}
		public static void m1(int i) {
			System.out.println("m1 1 args method");
		}
		public static void m1(double i) {
			System.out.println("m1 1 args method");
		}
		public static void main(String[] args) {
			m1(5.0);
			m1();
		}
			
	}
