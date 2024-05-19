package Methods;

public class TestMethodDemo {
	void m1(int i,int j) {
	System.out.println(i);
	System.out.println(j);
}
	void m1(int i,int j, int k) {
		m1(i,j);
		System.out.println(k);
	}
	void m1(int i,int j, int k, int a) {
		m1(i,j,k);
		System.out.println(a);
	}
	void m1(int i,int j, int k, int a, int b) {
		m1(i,j,k,a);
		System.out.println(b);
	}
}