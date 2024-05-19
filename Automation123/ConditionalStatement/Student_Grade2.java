package ConditionalStatement;

import java.util.Scanner;

public class Student_Grade2 {

		
        public static void main(String[] args) {
        System.out.println("start of the program");
		Scanner sc= new Scanner(System.in);
		System.out.println("-----------------");
		
		System.out.println("Enter subject marks");
		float sub1Marks= sc.nextFloat();
		float sub2Marks= sc.nextFloat();
		float sub3Marks= sc.nextFloat();
		float sub4Marks= sc.nextFloat();
		sc.nextLine();
		System.out.println("-----------------");
		
		System.out.println("enter name of the student");
		String name= sc.nextLine();
		System.out.println("---------------------");
		
		System.out.println("enter name of 4 subject");
		String subject1= sc.nextLine();
		String subject2= sc.nextLine();
		String subject3= sc.nextLine();
		String subject4= sc.nextLine();
		System.out.println("------------------");
		
		float totalMarks= sub1Marks + sub2Marks + sub3Marks + sub4Marks;
		System.out.println("totalMarks:" + totalMarks);
		System.out.println("-------------------");
		
		float percent= (totalMarks/400)*100;
		System.out.println("percent:" + percent);
		System.out.println("-------------------");
		
		if (sub1Marks >= 33 && sub2Marks >= 33 && sub3Marks >= 33 && sub4Marks >= 33)
		{
			if (percent>=75) {
					System.out.println("grade:- A");	
		}
		else if (percent>=65) {
			System.out.println("grade:- B");
		}
			
		else if (percent>=55) {
			System.out.println("grade:- C");
		}
		else if (percent>=45){
			System.out.println("grade:- D");
		}
		}
		else {
			System.out.println("fail");
		}
		System.out.println("-------------------");
		
		System.out.println("end of the program");
		sc.close();
		}
	}