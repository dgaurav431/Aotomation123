package OOPS_Inheritance_Relation;

public class CarController {
	public static void main(String[] args) {
		Engine e1= new Engine("tata" , "xyz" , 5000, 100);
		Car mycar= new Car("Tesla", "Model-3", "Electric", e1);
		mycar.display();
	}
}
