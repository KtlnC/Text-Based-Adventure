package game;

import person.Person;

public class Utilities {
	
	public static void greeting()
	{
		System.out.println("Welcome to the Ultimate SlaughterHouse.If you dare to enter, you must give us your name");
	}
	public static void giveinstructions()
	{
		String[] instructions = {"Okay so here is how things are going to go","Your goal is to find the Exit.  If you encounter a ghost, you must choose to fight or die","If you want to move north, type N", "If you want to move South, type S", "If you want to move West, type W","If you want to move East, type E", "If you are too chicken to much, well lets say bad things will happen","Enter at your own risk >:)."};
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

	public static String scaryscenarios()
	{
		String[] scenarios = {"You regret your every move as you can hear rasping voices in the background","Suddenly,THERES A NOISE! You turn back to find a tree branch scraping the window","There are moans and groans of the lost souls in the background","You wished you can call your parents to let them know you can make it.  But who knows if you can....","The devils hour is croaking down...They are all coming to get you","As you turn around, you thought you saw your long lost loved one, or was it just the other side trying to reel you in"};
		int sub = randomWithRange(0,scenarios.length-1);
		return scenarios[sub];
		
		}
	
}
