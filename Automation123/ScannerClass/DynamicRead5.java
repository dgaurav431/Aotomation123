package ScannerClass;
   
import java.util.Scanner;

public class DynamicRead5 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
        System.out.println("Enter first no");
        int n1= sc.nextInt();
        
        System.out.println("Enter second no");
        int n2= sc.nextInt();
        
        System.out.println("Enter third no");
        int n3= sc.nextInt();
        
        int smallest= (n1<n2) ? (n1<n2 ? n1:n2) : (n2<n3 ? n2:n3);
        System.out.println("Smallest no is:" + smallest);
        sc.close();
	}

}
