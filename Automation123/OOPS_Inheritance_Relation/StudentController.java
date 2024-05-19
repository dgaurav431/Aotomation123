package OOPS_Inheritance_Relation;

public class StudentController {
public static void main(String[] args) {
	Address add= new Address("A-29","sec-3", 201301, "Noida", "UP");
	Student st= new Student("Gaurav", 101, add);
	st.display();
}
}
