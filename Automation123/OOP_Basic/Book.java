package OOP_Basic;

public class Book {
    String writer;
	double price;
	String emailId;
	public void display() {
		System.out.println("Writer:" + writer);
		System.out.println("Price:" + price);
		System.out.println("Email:" + emailId);
	}
	public void setData(String writer, double price, String emailId) {
		this.writer= writer;
	    this.price= price;
	    this.emailId= emailId;
}
}