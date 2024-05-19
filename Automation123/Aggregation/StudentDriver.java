package Aggregation;

public class StudentDriver {

	public static void main(String[] args) {
		Address a1=new Address("NOIDA", "UP", 201301);
		Student s1=new Student("mohan", 204, a1);
		s1.displayStudent();
		Address a2=new Address("Delhi", "Delhi", 110101);
		Student s2=new Student("sohan", 301, a2);
		
		Student s3=new Student("john", 407, a1);
		s2.displayStudent();
		s3.displayStudent();
	}
}
