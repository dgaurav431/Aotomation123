package OOP_Basic;

public class StaticData {
   static int i;
   static int j;
   int a;
   int b;
   public static void main(String[] args) {
	System.out.println(i);
}
   public static void m1() {
	   System.out.println("m1 static method");
	   System.out.println(i);
   }
 public static void m2() {
	 System.out.println("m2 non static method");
	System.out.println(i);
   }
}
