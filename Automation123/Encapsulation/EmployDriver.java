package Encapsulation;

import java.util.Scanner;

public class EmployDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employ e1=new Employ();
		System.out.println("ENter the Name: ");
		String name1=sc.nextLine();
		e1.setName(name1);
		System.out.println("=========================");
		System.out.println("Name is: "+e1.getName());
	}
}
