package game;
//import java.util.InputMismatchException;
import java.util.Scanner;
import game.Utilities;
import person.Adult;
import person.Teen;
import person.Child;
import person.Person;

/**
 * Authors: Lamia Islam & Kaitlyn Cao
 * Created: 10/30/17
 * Description: Escape a house that feeds on your fear if you can or else...
 * */
public class Runner {
	public static void main(String[]args)
	{
		/*boolean gameOn = true;
		int scareLevel = 0;*/
		Scanner player1 = new Scanner(System.in);
		
		
		
			Utilities.greeting();
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
					Adult adult = new Adult(name,age);
					
					System.out.print("You are an adult");
				}
				if((age<18)&&(age>13))
				{
					
					Teen teen = new Teen("T",name,age,0,0);
					
					System.out.println("You are " + age + " years old." + " You are a teen.");
					System.out.println("Since you are a teen, you will be given two teens to accompany you. ");
				}
				if((age<13))
				{
					Child child = new Child(name,age);
				
					System.out.print("You are a child");
				}
				
				
				 boolean gameOn = true;
					int scareLevel = 0;
			while(gameOn)
			{
				
				Utilities.giveinstructions();
				System.out.println("Here is your starting point");
				int start1 = 0;
				int start2 = 0;
				int counter = 1;
				Utilities.updateMap("T",5,5,0,0);
				boolean response = true;
				while(response)
				{
				String nextresponse = player1.nextLine();
				
				if(nextresponse.equals("N"))
				{ 	
					Utilities.updateMap("T", 5, 5, start1-=counter, start2);
					if(start1>=4)
					{
						System.out.println("Invalid Move");
					}
				}
				if(nextresponse.equals("S"))
				{
					
					Utilities.updateMap("T", 5, 5, start1+=counter, start2);
					if(start1>=4)
					{
						System.out.println("Invalid Move");
						System.out.println("You have reached the peripheral of this house.  Your life ends here >:(");
						response = false;
					}
				}
				if(nextresponse.equals("W"))
				{
				
					Utilities.updateMap("T", 5, 5, start1, start2-=counter);
					
					
				}
				if(nextresponse.equals("E"))
				{
					
					Utilities.updateMap("T", 5, 5, start1, start2+=counter);
				}
				}
				
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
