package Composition;

public class Engine {

	int hp;
	int strokes;
	String type;
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	Engine(int hp, int strokes, String type)
	{
		this.hp=hp;
		this.strokes=strokes;
		this.type=type;
	}
	public void start()
	{
		System.out.println("Start the Engine");
	}
	public void displayEngine()
	{
		System.out.println("HP is: "+hp);
		System.out.println("Strokes is: "+strokes);
		System.out.println("Type is: "+type);
	}

}
