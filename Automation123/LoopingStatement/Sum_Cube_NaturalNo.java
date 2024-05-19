package LoopingStatement;
public class Sum_Cube_NaturalNo {
	public static void main(String[] args) {
		int i=1;
	       int sum=0;
	       while(i<=5) {
	     	  sum=sum+(i*i*i);
	     	 i++;
	       }
	       System.out.println("sum of cube of natural num is: "+sum);
	}
}
