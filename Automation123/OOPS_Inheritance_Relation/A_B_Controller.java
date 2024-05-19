package OOPS_Inheritance_Relation;

public class A_B_Controller {
public static void main(String[] args) {
	System.out.println("A class oprations");
	A obj1= new A();            //parent data
	System.out.println(obj1.i);       //parent data
	System.out.println(obj1.j); //parent data
	obj1.m1();
	/*
	 // we can't access this data because a,b, test() are child data 
	   so parent object can't access the child data.
	   
	 System.out.println(obj1.a);
	 System.out.println(obj1.b);
	 obj1.test();
	 */
	System.out.println("-------------------------------");
	System.out.println("B class oprations");
	B obj2= new B();
	System.out.println(obj2.a);      //child data
	System.out.println(obj2.b);      //child data
	obj2.test();                     //child data
	
	/*
	// child object can access parent data as well as 
	   its own class data
	*/
	
	 System.out.println(obj2.i);     //parent data
	 System.out.println(obj2.j);     //parent data
	 obj2.m1();                      //parent data
	
}
}
