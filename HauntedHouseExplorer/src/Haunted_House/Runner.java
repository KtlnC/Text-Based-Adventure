package Haunted_House;
import java.util.Scanner;

import Haunted_House.Person.Player;
public class Runner {
	public static void main(String[]args)
	{
		greeting();
		Scanner player1 = new Scanner(System.in);
		String name = player1.nextLine();
		Player player = new Player(name);
		System.out.println("Welcome " + name + ". Here is the map that will forlay your doom");
		printMap(5,3);
		System.out.println("Now let the games begin >:)");
		
	}
	public static void greeting()
	{
		System.out.println("Welcome to Kaitlyn's Haunted House. Mwahahaha. If you dare to enter, you must give us your name");
	}
	public static void printMap(int row, int column)
	{
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<column;j++)
			{
				System.out.print("[ ]");
			}
			System.out.println("[ ]");
		}
	}
}
