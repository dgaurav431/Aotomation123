package OOP_Basic;
public class Student {
	String studentName;
	int studentAge;
	String studentGender;
	double studentMobNo;
	
	public void course() {
		System.out.println("course enrolled");
	}
	public static void quali() {
		System.out.println("qualification");
	}
	public void skill() {
		System.out.println("skills known");
	}
	public static void main(String[] args) {
		Student obj1= new Student();
		obj1.quali();
		obj1.course();
		obj1.skill();
	}
}