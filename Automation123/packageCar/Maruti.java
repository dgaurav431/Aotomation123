package packageCar;
import packageBike.Hero;
public class Maruti extends Hero{
	Maruti()
	{
		super(23);
	}
	
	public static void main(String[] args) {
		System.out.println("Protected members of Hero==========");
		System.out.println(Hero.y);
		Hero.demo();
		Maruti m1=new Maruti();
	}
}
