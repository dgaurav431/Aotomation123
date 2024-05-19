package FinalVariable;

public class Employ {
	static String comp_name="ABC";
	String name;
	final int id;
	double salary;
	
	Employ(int id)
	{
		this.id=id;
	}
	
	Employ(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
}
