package OOPS_Inheritance_Relation;

public class Salary {
	int basicsal;
    int ta;
    int da;
    int hra;
    
public Salary(int basicsal, int ta,  int da, int hra) {
	this.basicsal= basicsal;
	this.ta= ta;
	this.da= da;
	this.hra= hra;
}
public void displaySalary() {
	System.out.println("BasicSal:" + this.basicsal);
	System.out.println("TA:"+ this.ta);
	System.out.println("DA:" + this.da);
	System.out.println("HRA:" + this.hra);
}
}
