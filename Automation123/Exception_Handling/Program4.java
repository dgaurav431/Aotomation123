package Exception_Handling;

import java.io.FileInputStream;
//import java.io.*;
public class Program4 {

public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("f:\\javafile.txt");
			System.out.println("File is availaible");
		}
		catch(Exception e)
		{
			System.out.println("File is not availaible");
		}
		
	}
}
