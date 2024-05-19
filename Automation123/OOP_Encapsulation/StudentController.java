package OOP_Encapsulation;

public class StudentController {
public static void main(String[] args) {
	Student s= new Student("Gaurav", 101, 9999999999l);
	
	System.out.println("Name is : " + s.getName());
	s.setName("Aman");
	s.setId(101);
	System.out.println(s.getName());
	System.out.println(s.getId());

}
}
