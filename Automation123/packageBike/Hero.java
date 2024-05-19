package packageBike;

public class Hero {

	public static int x=12;
	protected static int y=20;
	static int z=40;
	private static int p=50;
	public static void main(String[] args) {
		System.out.println(Hero.p);
		Hero.run();
	}
	
	public Hero()
	{
		System.out.println("Public Hero");
	}
	protected Hero(int x)
	{
		System.out.println("Protected Hero");
	}
	Hero(double x)
	{
		System.out.println("default Hero");
	}
	private Hero(String x)
	{
		System.out.println("Private Hero");
	}
	
	public static void test()
	{
		System.out.println("test method");
	}
	protected static void demo()
	{
		System.out.println("demo method");
	}
	static void start()
	{
		System.out.println("start method");
	}
	private static void run()
	{
		System.out.println("run method");
	}

}
