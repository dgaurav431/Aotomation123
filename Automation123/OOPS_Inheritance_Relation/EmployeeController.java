package OOPS_Inheritance_Relation;

public class EmployeeController {
	public static void main(String[] args) {
		Salary sal= new Salary(40000,5000, 5000, 20000);
		Employee emp= new Employee("Gaurav", 101, sal);
		emp.display();
	}
}
