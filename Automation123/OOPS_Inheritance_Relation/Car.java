package OOPS_Inheritance_Relation;

public class Car {
		String name;
	    String model;
	    String type;
	    Engine e1;
	    
	public Car(String name, String model, String type, Engine e1) {
		this.name= name;
		this.model= model;
		this.type= type;
		this.e1= e1;
	}
	public void display() {
		System.out.println("----------------------------");
		System.out.println("name:" + this.name);
		System.out.println("model:"+ this.model);
		System.out.println("type:" + this.type);
		System.out.println("Engine:");
		e1.displayEngine();
		System.out.println("-------------------------");
	}
	}
