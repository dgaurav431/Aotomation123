package OOPS_Inheritance_Relation;

public class Y extends X{
int a;
int b;
public Y (int a, int b, int i, int j) {
	super (i,j);
	this.a= a;
	this.b= b;
}
void display() {
    System.out.println(i);
	System.out.println(j);
	System.out.println(a);
	System.out.println(b);
}
}
