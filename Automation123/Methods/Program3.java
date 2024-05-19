package Methods;

public class Program3 {
	public static void m1() {
		System.out.println("m1 0 args method");
	}
	public static void m1(int i) {
		System.out.println("m1 1 int type args method");
	}
	public static void m1(int i, int j) {
		System.out.println("m1 2 int type args method");
	}
	public static void m1(double i) {
		System.out.println("m1 1 double type args method");
	}
	public static void m1(int i, double j) {
		System.out.println("m1 2 int double type args method");
	}
	public static void main(String[] args) {
		int a=12; m1(a,20.0);
		m1(12,35);
	}
	public static void m1(double i,int j) {
		System.out.println("m1 2 double int type args method");
	}
	public static void m1(byte i, double j) {
		System.out.println("m1 2 bte double type args method");
	}
}
