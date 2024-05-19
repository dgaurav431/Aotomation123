package packageBike;

public class Driver {

	public static void main(String[] args) {
		System.out.println("From same package bike");
		System.out.println("===========public=============");
		System.out.println(Hero.x);
		System.out.println(Yamaha.p);
		Hero.test();
		Yamaha.talk();
		Hero h1=new Hero();
		System.out.println("========protected===========");
		System.out.println(Hero.y);
		System.out.println(Yamaha.q);
		Hero.demo();
		Yamaha.work();
		System.out.println("=================default======");
		System.out.println(Hero.z);
		Hero.start();
	}
}
