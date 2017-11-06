package person;

public class Child extends Person{
	private String name;
	private int age;
	private int x, y;
	private String character;
	public Child(String character,String name, int age,int x,int y)
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
	
	public int updateX(int counter)
	{
		return counter+=x;
	}
	public int updateY(int counter)
	{
		return counter+=y;
	}
	public String getcharacter()
	{
		return "C";
	}
	public void print()
	{
		System.out.println("I am a Child");
	}
}
