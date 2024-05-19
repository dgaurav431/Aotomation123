package GameProject;

import java.util.Scanner;

public class Game {

	public Weapon pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int score=sc.nextInt();
		if(score<=500)
		{
			System.out.println("You Got the Knife!");
			Knife k=new Knife();
			return k;
		}
		else if(score<=1000)
		{
			System.out.println("Press 1 to take Knife and 2 for Gun");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("You have selected Knife");
				Knife k=new Knife();
				return k;
			case 2:
				System.out.println("You have selected Gun");
				Gun g=new Gun();
				return g;
			default:
				System.out.println("Please press valid Option");
				return null;
				
			}
		}
		else
		{
			System.out.println("You got the Bomb!");
			Bomb b=new Bomb();
			return b;
		}
	}
}
