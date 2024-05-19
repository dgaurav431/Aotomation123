package Constructor;

public class Fruit1Driver {
	public static void main(String[] args) {
		Fruit1 f1=new Fruit1("Mango", 120, 3.8);
		Fruit1 f2=new Fruit1("Grapes", 90, 2.6);
		Fruit1 f3=new Fruit1("Orange", 80, 4.8);
		f1.displayFruit1();
		f2.displayFruit1();
		f3.displayFruit1();
		Fruit1 f4=new Fruit1();
		f4.displayFruit1();
		Fruit1 f5=new Fruit1("Papaya");
		f5.displayFruit1();
		Fruit1 f6=new Fruit1("Guava", 52);
		f6.displayFruit1();
	}
}
