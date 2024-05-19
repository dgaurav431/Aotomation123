package LogicalStatement;
public class Count_Digit {
	public static void main(String[] args) {
		int n=87543;
		int count=0;
        while(n>0) {
        	 count++;
        	 n=n/10;
        } 
        System.out.println("total count is: "+count);
	}     
}
