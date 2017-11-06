package person;

public class Adult extends Person{

	private String name;
	private int age;
	private int x, y;
	private String character;
	public Adult(String character,String name, int age,int x, int y)
	{
		super(character,name,age,x,y);
	}
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	public String getcharacter()
	{
		return "A";
	}
	public void print()
	{
		System.out.println("I am an adult");
	}
}
