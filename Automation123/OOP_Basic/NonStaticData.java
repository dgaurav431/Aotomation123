package OOP_Basic;

public class NonStaticData {
int a;
char b;
double c;
public static void main(String[] args) {
	NonStaticData obj1= new NonStaticData();
	NonStaticData obj2= new NonStaticData();
	System.out.println(obj1);
	System.out.println(obj2);
	System.out.println(obj1.b);
	obj1.b= 'A';
	System.out.println(obj1.b);
	System.out.println(obj2.c);
}
}
