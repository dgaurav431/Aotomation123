package OOP_Basic;

public class StudentQJS2 {
	String name;
	long phone;
	String emailId;
	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Phone:" + phone);
		System.out.println("Email:" + emailId);
	}
	public void setData(String name1, String emailId2, long phone3) {
		this.name= name1;
		this.emailId= emailId2;
		this.phone= phone3;
	}
}
