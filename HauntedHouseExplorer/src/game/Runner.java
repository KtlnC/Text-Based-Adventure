package game;
import java.util.Scanner;
import game.Utilities;
import person.Adult;
import person.Teen;

/**
 * Authors: Lamia Islam & Kaitlyn Cao
 * Created: 10/30/17
 * Description: Escape a house that feed on your fear if you can or else...
 * */
public class Runner {
	public static void main(String[]args)
	{
		boolean gameOn = true;
		int scareLevel = 0;
		Scanner player1 = new Scanner(System.in);
		
		while(gameOn)
		{
			
			greeting();
			String name = player1.nextLine();
			System.out.println("Welcome " + name + ". Here is the map that will forlay your doom");
			printMap(5,3);
			System.out.println("Before we proceed, you must provide your age.");
			int age = player1.nextInt();
			
			if(age>18)
			{
				Adult player = new Adult(name,age);
				System.out.print("You are an adult");
			}
			if((age<18)&&(age>13))
			{
				Teen player = new Teen(name,age);
				System.out.print("You are a teen. ");
			}
			System.out.println("Now let the games begin >:)");
			scareLevel++;
			if(scareLevel>0)
			{
				gameOn = false;
			}
			
		}
		
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
