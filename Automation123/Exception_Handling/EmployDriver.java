package Exception_Handling;

public class EmployDriver {

	public static void main(String[] args) {
		Employ e1=new Employ("mohan", 123);
		System.out.println("Name is: "+e1.name);
		e1=null;
		System.out.println("name is: "+e1.name);
	}
}
