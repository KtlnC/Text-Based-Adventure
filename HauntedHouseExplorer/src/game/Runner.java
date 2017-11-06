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
import person.Ghost;
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
		int Choice = Utilities.randomWithRange(1, 2);
		int ghostx = Utilities.randomWithRange(1, 4);
		int ghosty = Utilities.randomWithRange(1, 4);
		int ghostx1 = Utilities.randomWithRange(1, 4);
		int ghosty1= Utilities.randomWithRange(1, 4);
		Ghost ghost1 = new Ghost(ghostx,ghosty);
		Ghost ghost2 = new Ghost(ghostx1,ghosty1);
		System.out.println(Choice);
		System.out.println(ghost1.getgX());
		System.out.println(ghost1.getgY());
		System.out.println(ghost2.getgX());
		System.out.println(ghost2.getgY());
		Board board1 = new Board(5,5);
		boolean gameOn = true;
		int scareLevel = 0;
		Scanner player1 = new Scanner(System.in);
		
		
		
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
						String c = player.getcharacter();
						
						int x = player.getx();
						int y = player.gety();
						board1.updateMap(c,x,y);
						boolean response = true;
						int One = 1;
						while(response)
						{
							
							String direction = player1.nextLine();
							
							if(direction.equals("W"))
							{
								board1.updateMap(c, x, y-One);
								if((y<=0)||(y==1))
								{
									System.out.println("Dont you dare go there");
									y++;
								}
								y--;
								System.out.println(y);
							}
							if(direction.equals("E"))
							{
								board1.updateMap(c, x, y+One);
								if(y==3)
								{
									System.out.println("Dont you dare go there");
									y--;
								}
								y++;
							}
							
							if(direction.equals("N"))
							{
								board1.updateMap(c, x-One, y);
								if(x==1)
								{
									System.out.println("Dont you dare go there");
									x++;
								}
								x--;
								System.out.print(x);
							}
							if(direction.equals("S"))
							{
								board1.updateMap(c, x+One, y);
								if(x==3)
								{
									System.out.println("Dont you dare go there");
									x--;
								}
								x++;
							}
							if((x==ghost1.getgX())&&(y==ghost1.getgY()))
							{
								
								response = false;
								gameOn = false;
							}
							if((x==ghost2.getgX())&&(y==ghost2.getgY()))
							{
								response = false;
								gameOn = false;
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
	
	}
		
		
	
	



