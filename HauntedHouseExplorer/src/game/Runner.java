package game;
//import java.util.InputMismatchException;
import java.util.Scanner;
import game.Utilities;
import person.Adult;
import person.Teen;
import person.Child;

/**
 * Authors: Lamia Islam & Kaitlyn Cao
 * Created: 10/30/17
 * Description: Escape a house that feeds on your fear if you can or else...
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
			Utilities.printMap(5,3);
			boolean isInt = false;
			while(!isInt)
			{
			 try {
				System.out.println("Before we proceed, you must provide your age.");
				String ageS = player1.nextLine();
				int age = Integer.parseInt(ageS);
				if(age>18)
				{
					Adult player = new Adult(name,age);
					System.out.print("You are an adult");
				}
				if((age<18)&&(age>13))
				{
					Teen player = new Teen(name,age);
					System.out.println("You are " + age + " years old." + " You are a teen.");
					System.out.println("Since you are a teen, you will be given two teens to accompany you. ");
				}
				if((age<13))
				{
					Child player = new Child(name,age);
					System.out.print("You are a child");
				}
				System.out.println("Now let the games begin >:)");
				isInt = true;
			 }
			 catch(NumberFormatException e)
			 {
				 System.out.println("That was error type: " + e);
				 System.out.println("That was not a number. Please try again");
				
			 }
			
			
			}
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

}
