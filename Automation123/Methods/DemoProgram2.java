package Methods;

public class DemoProgram2 {
	static int i=1;
	public static void m1() {
	++i;
	}
	public static void m2() {
		i++;
	}
	public static void main(String[] args) {
		System.out.println("Start of Main");
		System.out.println(i);
		m2();
		m1();
		m3();
		System.out.println(i);
		System.out.println("End of Main");
	}
	public static void m3() {
		i= i++;
	}
}
