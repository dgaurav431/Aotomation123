package Methods;

public class DemoProgram {
	public static void m1() {
		System.out.println("Start of m1");
		System.out.println("End of m1");
	}
	
	public static void m2() {
		System.out.println("Start of m2");
		System.out.println("End of m2");
		
	}
	public static void main(String[] args) {
		System.out.println("Start of Main");
		m2();
		m1();
		m3();
		System.out.println("End of Main");
	}
	
	public static void m3() {
		System.out.println("Start of m3");
		System.out.println("End of m3");
	
	}
}
