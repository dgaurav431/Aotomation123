package Operators;

public class RelationalOp4 {

public static void main(String[] args) {
	
	int n1 =10;
	int n2 =20;
	int n3 =30;
	
	int smallest = (n1 < n2)?(n3 < n1 ? n3 : n1):(n2 < n3 ? n2 : n3);
	
	System.out.println("The smallest no is:" + smallest);
	
}		
	}
