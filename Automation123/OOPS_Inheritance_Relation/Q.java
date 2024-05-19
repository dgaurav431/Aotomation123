package OOPS_Inheritance_Relation;

public class Q extends P {
	int i= 200;
	int j= 100;
	public void display() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(super.i);
		System.out.println(super.j);
	}
}
