package LoopingStatement;
public class Sum_Square_NaturalNo {
	public static void main(String[] args) {
       int i=1;
       int sum=0;
       while(i<=5) {
     	  sum=sum+(i*i);
     	 i++;
       }
       System.out.println("sum of square of natural num is: "+sum);
	}
}
