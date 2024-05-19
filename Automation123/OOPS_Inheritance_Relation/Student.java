package OOPS_Inheritance_Relation;

public class Student {
     String name;
     int id;
     Address add;
     public Student(String name, int id, Address add) {
    	 this.name= name;
    	 this.id= id;
    	 this.add= add;
     }
public void display() {
	System.out.println("-------------------------");
	System.out.println("Name:" + this.name);
	System.out.println("Id:" + id);
	System.out.println("Address:");
	add.displayAddress();
	System.out.println("--------------------------");
}
}
