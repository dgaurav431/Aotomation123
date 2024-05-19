package OOP_Encapsulation;

public class Student {
private static  String clgName= "QJSP";
private String name;
private int id;
private long phone;
public Student(String name, int i, long l) {
	// TODO Auto-generated constructor stub
}
//setter method
public void setName(String name) {
	this.name=name;
}
public void setId(int id) {
	this.id=id;
}
//getter method
public String getName() {
	return this.name;
}
public int getId() {
	return id;
}
}
