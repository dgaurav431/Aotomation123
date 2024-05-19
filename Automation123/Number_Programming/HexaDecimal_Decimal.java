package Number_Programming;
import java.util.Scanner;
public class HexaDecimal_Decimal {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Hexadecimal Number: ");
			String n=sc.next();
			System.out.println(getDecimal(n));
		}
		public static String getDecimal(String n)
		{
			int len=n.length();
			int dec=0;		int comp=1;
			for(int i=len-1;i>=0; i--)
			{
				char x=n.charAt(i);
				if(x>=48 && x<=57)
					dec=dec+(x-48)*comp;
				else if(x>='A' && x<='F')
					dec=dec+(x-55)*comp;
				else if(x>='a' && x<='f')
					dec=dec+(x-87)*comp;
				else
					return "Invalid Hexadecimal Input";	
				comp=comp*16;
			}
			return "The Decimal Value is: "+dec;
		}
	}
