package OOP_Basic;

public class Car_Watch_Dog {
    String carBrand;
    String model;
    String colour;
    double price;
    String type;
    String dial;
    String battery;
    
    public void mileage() {
    	System.out.println("car mileage");
    }
    public void speed() {
    	System.out.println("car speed");
    }
    public static void gear() {
    	System.out.println("no of gear");
    }
    public void electric() {
    	System.out.println("self");
    }
    
    public void type() {
    	System.out.println("watch type");
    }
    public void dial() {
    	System.out.println("watch dial");
    }
    public static void battery() {
    	System.out.println("watch battery life");
    }
    public void automatic() {
    	System.out.println("display time and date");
    }
    
    String dogBreed;
    String dogName;
    String food;
    String domesticated;
    
    public void breed() {
    	System.out.println("imported dog");
    }
    
    public void pet() {
    	System.out.println("domesticated");
    }
    public void hair() {
    	System.out.println("dog with hair");
    }
    public static void food() {
    	System.out.println("vegetarian");
    }
    
    public static void main(String[] args) {
    	Car_Watch_Dog obj1= new Car_Watch_Dog();
		obj1.food();
		obj1.dial();
		obj1.electric();
	}
}
