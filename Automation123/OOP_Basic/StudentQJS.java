package OOP_Basic;

public class StudentQJS {
String name;
long phone;
String emailId;
public void display() {
	System.out.println("Name:" + name);
	System.out.println("Phone:" + phone);
	System.out.println("Email:" + emailId);
}
public void setData(String name, String emailId, long phone) {
	this.name= name;
	this.emailId= emailId;
	this.phone= phone;
}
}
