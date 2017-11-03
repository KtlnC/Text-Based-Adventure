package game;
import person.Person;
import person.Teen;
public class Utilities {

	
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
	public static void updateMap(String personType, int row, int column, int x,int y)
	{
		
		String[] Row = new String[row];
		String[] Column = new String[column];
		for(int i = 0;i<Row.length;i++)
		{
			for(int j = 0;j<Column.length;j++)
			{
				
				Column[i] = "[ ]";
			
				 
			}
			
			Row[i] = "[ ]";
			Row[x] = "[" + personType + "]";
			
		}
		
		for(int i = 0;i<Row.length;i++)
		{
			for(int j = 0;j<Column.length;j++)
			{
				System.out.print(Column[i]);
			}
			System.out.println(Row[i]);
		}
	}
	public static int getxcoord(int x)
	{
		return x;
	}
	public static int getycoord(int y)
	{
		return y;
	}
	public static String chooseMove(String s)
	{
		return s;
	}
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
	
	
}
