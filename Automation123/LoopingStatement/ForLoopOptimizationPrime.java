package LoopingStatement;

public class ForLoopOptimizationPrime {

	public static void main(String[] args) {
        int num=17;
        if(num<1) {
        	System.out.println("not prime");
        }else if(num%2==0 && num!=2){
        	System.out.println("not prime");
        }else{
        	int count=0;
        	int i=2;
        	while(i<=num/2) {
        		count++;
        		break;
        	}
        	i++;
        }
        int count=0;
        if (count==0) {
        	System.out.println("prime");
        }else{
        	System.out.println("not prime");
        }
	}

}
