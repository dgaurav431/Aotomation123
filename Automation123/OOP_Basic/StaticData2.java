package OOP_Basic;

public class StaticData2 {
	static int i;
	   static int j;
	   static {
		   System.out.println("Hello");
	   }
	   static {
		   System.out.println("Programming");
	   }
	   public static void main(String[] args) {
		   System.out.println("start of main");
		   System.out.println(i);
		   System.out.println("end of main");
		   m1();
		   StaticData2 obj= new StaticData2();
		   obj.m2();
	   }
		   static {
			   System.out.println("Java");
		   }
		   static {
			   i= 90;
			   j= 100;
			   System.out.println("Sql");
		   }public static void m1() {
			   System.out.println("m1 static method");
			   System.out.println(i);
		   }
		   public void m2() {
			   System.out.println("m2 non static method");
			   System.out.println(i);
		   }
	}
