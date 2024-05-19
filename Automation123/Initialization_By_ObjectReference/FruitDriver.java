package Initialization_By_ObjectReference;

public class FruitDriver {

public static void main(String[] args) {
		System.out.println("main method starts");
		Fruit f1=new Fruit();
		Fruit f2=new Fruit();
		
		f1.name="Mango";
		f1.price=120;
		f1.weight=2.8;
		
		f2.name="Apple";
		f2.price=130;
		f2.weight=4.8;
  }
}
