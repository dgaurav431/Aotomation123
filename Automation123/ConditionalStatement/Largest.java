package ConditionalStatement;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		System.out.println("largest no is: ");
		int n1=10;
		int n2=20;
		int n3=25;
		int n4=15;
		int s1= n1>n2?n1:n2;
		int s2= s1>n3?s1:n3;
		int largest= s2>n4?s2:n4;
		System.out.println(largest);
	}

}
