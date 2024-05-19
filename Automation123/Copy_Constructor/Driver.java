package Copy_Constructor;

public class Driver {

	public static void main(String[] args) {
		Fruit f1=new Fruit("Mango", 120, 3.8);
		Fruit f2=new Fruit(f1);
		
		f1.displayFruit();
		f2.displayFruit();
		Fruit f3=new Fruit("Grapes", 90, 6.8);
		Fruit f4=new Fruit("Orange", 60, 2.4);
		Fruit f5=new Fruit("Papaya", 50, 3.2);
		
		Fruit f6=new Fruit(f4);
		f4.displayFruit();
		f6.displayFruit();
		
		Fruit f7=new Fruit(f3);
		f3.displayFruit();
		f7.displayFruit();
		
		Fruit f8=new Fruit(f5, 5.77);
		f5.displayFruit();
		f8.displayFruit();
	}
}
