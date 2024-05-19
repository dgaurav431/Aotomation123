package OOPS_Inheritance_Relation;

public class BC extends AB {
	int a;
	int b;
	public void t1() {
		System.out.println("class BC method (child)");
	}
	BC(){
		super(10,20);
	}
}
