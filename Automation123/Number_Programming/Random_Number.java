package Number_Programming;

public class Random_Number {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10));
		System.out.println((int)(Math.random()*100));
		System.out.println("Any 4 digit number generation=======");
		int a=1000;
		int b=9999;
		int ran_num=(int)(Math.random()*(b-a))+a+1;
		System.out.println(ran_num);
		
	}
}
