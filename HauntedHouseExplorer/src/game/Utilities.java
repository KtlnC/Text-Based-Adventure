package game;

import person.Person;

public class Utilities {
	
	public static void greeting()
	{
		System.out.println("Welcome to Kaitlyn's Haunted House. Mwahahaha. If you dare to enter, you must give us your name");
	}
	public static void giveinstructions()
	{
		String[] instructions = {"Okay so here is how things are going to go","If you want to move north, type N", "If you want to move South, type S", "If you want to move West, type W","If you want to move East, type E", "If you are too chicken to much, well lets say bad things will happen","Enter at your own risk >:)."};
		for(int i  = 0;i<instructions.length;i++)
		{
			System.out.println(instructions[i]);
		}
	}
	public static int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	public static Person[] extraplayers = new Person[5];

	
	
}
