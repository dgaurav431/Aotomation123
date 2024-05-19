package Encapsulation;

public class FacebookDriver {
	public static void main(String[] args) {
		Facebook f1=new Facebook(new User("Mohan Vidrohi", 23, "Male", "mohan121", 2344));
		f1.accessProfile();
	}
}
