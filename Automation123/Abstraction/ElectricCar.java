package Abstraction;
            //normal class....................
	public class ElectricCar extends Car{
		ElectricCar()
		{
			System.out.println("ElectricCr Constructor");
		}
		@Override
		public void start()
		{
			System.out.println("Start the ElectricCar");
		}
		@Override
		public void drive()
		{
			System.out.println("drive the ElectricCar");
		}
		@Override
		public void openGate()
		{
			System.out.println("open the gate of  the ElectricCar");
		}
}
