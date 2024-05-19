package LoopingStatement;
import java.util.Scanner;
public class ForOddUserDefined {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("start of main");
        System.out.println("Enter two no");
        int start= sc.nextInt();
        int end= sc.nextInt();
       
        for(; start<=end; start++) {
        	if(start%2==1) {
        		System.out.println(start);
        		}
        }
      
        System.out.println("end of main");
        sc.close();
	}

}
