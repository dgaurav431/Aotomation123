package ConditionalStatement;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
				       
		        System.out.println("start of the program");
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter 1st no");
				int n1= sc.nextInt();
				
				System.out.println("Enter 2nd no");
				int n2= sc.nextInt();
				
				System.out.println("List of operation:");
				System.out.println("Press 1 for add");
				System.out.println("Press 2 for sub");
				System.out.println("Press 3 for mul");
				System.out.println("Press 4 for div");
				int choice= sc.nextInt();
				
				switch (choice) {
				
			        case 1 :
					int sum= n1 + n2;
					System.out.println("sum of two no:" + sum);	
				    break;
				
					case 2 :
					int sub= n1-n2;
					System.out.println("sub of two no:" + sub);
					break;
					
					case 3 :
					int mul= n1*n2;
					System.out.println("mul of two no:" + mul);
					break;
					
					case 4 :
					int div= n1/n2;
					System.out.println("div of two no:" + div);
					break;
					
				default :
					System.out.println("please enter valid data");
				}
				System.out.println("end of the program");
			sc.nextInt();
			}
		}

