package Program_Practice;
public class Factor {
	public static void main(String[] args) {
        int i=1;
        int num=24;
        System.out.println("factor of " +num +" : ");
        while(i<=num) {
        	if(num%i==0) {
        		if(num==i) {
        			System.out.println(i);
        		}
        		else {
        			System.out.println(i + ", ");
        		}
        	}
        	i++;
        }
	}

}
