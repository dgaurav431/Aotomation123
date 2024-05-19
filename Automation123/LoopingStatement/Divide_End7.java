package LoopingStatement;
public class Divide_End7 {
	public static void main(String[] args) {
         System.out.println("print and count num");
         int i=1;
         int count=0;
         while(i<=1000) {
        	 if(i%7==0 || i%10==7) {
        		 System.out.println(i);
        		 count ++;
        	 }
        	 i++;
         }
         System.out.println("count of num is: "+count);
	}
}
