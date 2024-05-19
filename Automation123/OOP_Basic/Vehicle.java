package OOP_Basic;

public class Vehicle {
	 String name;
		double price;
		String type;
		public void display() {
			System.out.println("Name:" + name);
			System.out.println("Price:" + price);
			System.out.println("Type:" + type);
		}
		public void setData(String name, double price, String type) {
			this.name= name;
		    this.price= price;
		    this.type= type;
	}
}
