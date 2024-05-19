package OOP_Basic;

public class NonStaticBlock2 {
	{
		   System.out.println("Non Static Block1");
	   }
	static {
		   System.out.println("Static Block1");
	   }
	{
		   System.out.println("Non Static Block2");
	   }
	static {
		   System.out.println("Static Block2");
	   }
	public static void main(String[] args) {
		System.out.println("start of main");
		System.out.println("logic");
		NonStaticBlock2 obj1= new NonStaticBlock2();
		System.out.println("main end");
	}
	
	   static {
		   System.out.println("Static Block3");
	   }
	   {
		   System.out.println("Non Static Block3");
	   }
}
