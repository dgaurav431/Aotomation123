package ConditionalStatement;

public class Prime {

	public static void main(String[] args) {
     int start=10;
     int end=40;
     for(;start<=end;start++) {
    	 int num=start;
         int count=0;
    	 if(num>=2) {
    		for(int i=2;i<=num/2;i++) {
    			if(num%i==0) {
    				count++;
    				break;
    			}
    		} 
    	 }
    	 if(count==0) {
    		System.out.println(num); 
    	 }
     }
	}

}
