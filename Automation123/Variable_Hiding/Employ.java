package Variable_Hiding;

public class Employ {
int p=563;
	
	public void demo()
	{
		System.out.println("This is non-static demo method");
		int p=380;
		System.out.println("Local p is: "+p);
		System.out.println("Global p is: "+this.p);
	}

	public static void main(String[] args)
	{
		Employ e1=new Employ();
		e1.demo();
	}
  
}
