package Initialization_By_NonStaticMethod;

public class FruitDriver {
	public static void main(String[] args) {
		
		Fruit f1=new Fruit();
		 f1.setValue("Mango", 120, 2.8);
		 f1.displayDetails();
		 
	     Fruit f2=new Fruit();   
	     f2.setValue("Apple", 130, 4.8);
	     f2.displayDetails();
	     
	     Fruit f3=new Fruit();   
	     f3.setValue("Orange", 110, 5.7);
	     f3.displayDetails();
	}              
}
