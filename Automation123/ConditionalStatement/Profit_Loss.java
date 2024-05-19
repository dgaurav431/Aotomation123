package ConditionalStatement;
import java.util.Scanner;
class Profit_Loss {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price");
        int cp=sc.nextInt();
        System.out.println("enter selling price");
        int sp=sc.nextInt();
        int profit= sp-cp;
        int loss= cp-sp;
        int pp= (profit*100)/cp;
        int lp= (loss*100)/cp;
        if(cp==sp) {
        	System.out.println("not profit no loss");
        }
        else if(cp<sp) {
        	System.out.println("profit percent is: "+pp);
        }
        else if(cp>sp) {
        	System.out.println("loss percent is: "+lp);
        }
        else {
        	System.out.println("enter valid input");
        }
	}

}
