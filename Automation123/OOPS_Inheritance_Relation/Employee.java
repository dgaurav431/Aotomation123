package OOPS_Inheritance_Relation;

public class Employee {
	 String name;
     int id;
     Salary sal;
     public Employee(String name, int id, Salary sal) {
    	 this.name= name;
    	 this.id= id;
    	 this.sal= sal;
     }
public void display() {
	System.out.println("-------------------------");
	System.out.println("Name:" + this.name);
	System.out.println("Id:" + id);
	System.out.println("Salary:");
	sal.displaySalary();
	System.out.println("--------------------------");
}
}

