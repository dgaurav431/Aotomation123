package Methods;

public class Method_Sum2 {
	public static double sum(int n1,double n2) {
		double result= n1+ n2;
		return result;
	}
	public static void display() {
		System.out.println("Display all the info of the class");
	}
public static void main(String[] args) {
	display();
	int i= (int)sum(10,20);
	System.out.println(i);
}
}