package Methods;

public class Methoda_Calling {
public static void m1() {
	    System.out.println("Hello Java Class");
}
public static void main(String[] args) {
	m1();
    m2(10,20);
}
public static void m2(int i, int j) {
	System.out.println("i=" + i + ", j=" + j);
}
}
