package ConditionalStatement;

import java.util.Scanner;

public class SwitchLeapYear {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
      System.out.println("Enter a year");
      int year= sc.nextInt();
      boolean isLeapYear;
      switch (year%4) {
      case 1:
    	  if(year%100==0) {
    		  isLeapYear= year%400==0;
    	  }
    	  else {
    		  isLeapYear= true;
    	  }
    	  break;
    	  default:
    		  isLeapYear= false;
    		  break;
      }
      if(isLeapYear) {
    	  System.out.println(year + ": Is a leap year");
      }else {
    	  System.out.println(year + ": not a leap year");
    	  }
      sc.close();
      }
}
