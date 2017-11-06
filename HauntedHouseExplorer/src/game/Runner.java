package game;
//import java.util.InputMismatchException;
import java.util.Scanner;
import floors.FirstFloor;
import game.Utilities;
import person.Adult;
import person.Teen;
import person.Child;
import person.Person;
import person.Entity;
import board.Board;
import floors.Attic;
/**
 * Authors: Lamia Islam & Kaitlyn Cao
 * Created: 10/30/17
 * Description: Escape a house that feeds on your fear if you can or else...
 * */
public class Runner {
	public static void main(String[]args)
	{
		Board board1 = new Board(5,5);
		boolean gameOn = true;
		int scareLevel = 0;
		Scanner player1 = new Scanner(System.in);
		
			Entity ghost1 = new Entity(3,2);
			
			Utilities.greeting();
			String name = player1.nextLine();
			System.out.println("Welcome " + name + ". Here is the map that will forlay your doom");
			board1.printmap();
			
			boolean isInt = false;
			while(!isInt)
			{
			 try {
				System.out.println("Before we proceed, you must provide your age.");
				String ageS = player1.nextLine();
				int age = Integer.parseInt(ageS);
				
				Person player = new Teen("T",name,age,0,0);
				if(age>18)
				{
					player = new Adult("A",name,age,0,0);
					
					System.out.print("You are an adult");
				}
				if((age<18)&&(age>13))
				{
					
					player = new Teen("T",name,age,0,0);
					
					System.out.println("You are " + age + " years old." + " You are a teen.");
					System.out.println("Since you are a teen, you will be given two teens to accompany you. ");
				}
				if((age<13))
				{
					player = new Child("C",name,age,0,0);
				
					System.out.print("You are a child");
				}
				player.print();
			 
					while(gameOn)
					{
						
						Utilities.giveinstructions();
						System.out.println("Here is your starting point");
						board1.updateMap(player.getcharacter(),player.getx(),player.gety());
						
						
							
						
						
						//String inputOne = player1.nextLine();
								
						scareLevel++;
						if(scareLevel>0)
						{
							gameOn = false;
						}
					}
				isInt = true;
			 }
			 catch(NumberFormatException e)
			 {
				 System.out.println("That was error type: " + e);
				 System.out.println("That was not a number. Please try again");
				
			 }
			
			
			
			}
			
	
			
			player1.close();
		
			
	}
	
		
	/*public static Object createPerson(String character, String name, int age, int x, int y)
	{
		if(character.equals("T"))
		{ 
			Teen teen = new Teen(character,name,age,x,y);
		}
		
		
	}*/
	}
		
		
	
	



