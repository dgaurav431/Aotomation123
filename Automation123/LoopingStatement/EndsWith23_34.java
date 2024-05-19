package LoopingStatement;

public class EndsWith23_34 {
	public static void main(String[] args) {
        System.out.println("print and count num");
        int i=1;
        int count=0;
        while(i<=1000) {
       	 if(i%100==23 || i%100==34) {
       		 System.out.println(i);
       		 count ++;
       	 }
       	 i++;
        }
        System.out.println("count of num is: "+count);
	}
}
