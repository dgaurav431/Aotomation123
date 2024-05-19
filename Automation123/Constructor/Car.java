package Constructor;

public class Car {

	static int count=0;
	Car(){
		count++;
		System.out.println("car obj " +count + "  is created");
	}
}
