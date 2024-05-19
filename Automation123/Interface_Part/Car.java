package Interface_Part;

public class Car implements PetrolVehicle{
	
	@Override
	public void start()
	{
		System.out.println("Start the car");
	}
	@Override
	public void drive()
	{
		System.out.println("drive the car");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Accelerate the car");
	}

	@Override
	public void stop()
	{
		System.out.println("Stop the car");
	}


}
