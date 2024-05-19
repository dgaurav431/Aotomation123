package ConditionalStatement;
import java.util.Scanner;
public class Student_Grade {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter student name");
	String name=sc.next();
	sc.nextLine();
	System.out.println("---------------name of subject--------------");
	String sub1=sc.nextLine();
	String sub2=sc.nextLine();
	String sub3=sc.nextLine();
	String sub4=sc.nextLine();
	String sub5=sc.nextLine();
	System.out.println("-------------marks of student-----------");
	float sub1marks=sc.nextFloat();
	float sub2marks=sc.nextFloat();
	float sub3marks=sc.nextFloat();
	float sub4marks=sc.nextFloat();
	float sub5marks=sc.nextFloat();
	float totalMarks=(sub1marks + sub2marks + sub3marks + sub4marks + sub5marks);
	System.out.println("total marks: "+ totalMarks);
	float percent=(totalMarks*100/500);
	System.out.println("total percent: "+percent);
	if(percent>=75) {
		System.out.println("Grade- A");
	}
	else if(percent>=65) {
		System.out.println("Grade- B");
	}
	else if(percent>=55) {
		System.out.println("Grade- C");
	}
	else if(percent>=35) {
		System.out.println("Grade- D");
	}
	else {
		System.out.println("Fail");
	}
	sc.close();
}
}
