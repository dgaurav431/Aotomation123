package Abstraction;

	public abstract class Car extends Vehicle{
		
		Car()
		{
			System.out.println("Car class constructor");
		}
		
		public abstract void openGate();
		
		public void applyBreak()
		{
			System.out.println("Apply break in Car");
		}

}
