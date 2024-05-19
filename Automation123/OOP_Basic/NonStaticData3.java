package OOP_Basic;

public class NonStaticData3 {
	static int data= 24;
	int a;
	char b;
	double c;
	public static void main(String[] args) {
		NonStaticData3 obj1= new NonStaticData3();
		NonStaticData3 obj2= new NonStaticData3();
		System.out.println(NonStaticData3.data);
		System.out.println(obj1.a);
		System.out.println(obj1.data);
		System.out.println(obj1.b);
		obj1.data= 78;
		System.out.println(obj1.data);
		System.out.println(obj2.data);
		obj1.a= 20;
		System.out.println(obj1);
	}
}
