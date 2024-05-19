package Array;

import java.util.Scanner;

public class OnlyEven {
public static void main(String[] args) {
	System.out.println("Print only even numbers");
	Scanner sc= new Scanner(System.in);
	int[] arr;
	arr= new int[25];
	for(int i=0; i<arr.length; i++) {
		if(arr[i]%2==0) {
	System.out.println(arr[i]);
	}
}
}
}