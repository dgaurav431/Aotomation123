package Interface_Part;

public class Bike implements PetrolVehicle{
	
	@Override
	public void start()
	{
		System.out.println("Start the Bike");
	}
	
	public void drive()
	{
		System.out.println("drive the Bike");
	}
	
	public void accelerate()
	{
		System.out.println("Accelerate the bike");
	}

	@Override
	public void stop()
	{
		System.out.println("Stop the Bike");
	}



}
