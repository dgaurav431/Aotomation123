package Interface_Part;

public class F extends E{

	@Override
	public void start()
	{
		System.out.println("Start from F");
	}
	@Override
	public void takeScreenshot()
	{
		System.out.println("Take sceenshot from F");
	}
	@Override
	public void run()
	{
		System.out.println("Run method of E");
	}
	
}
