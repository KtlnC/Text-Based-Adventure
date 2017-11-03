package person;

public abstract class Person {

	private String name;
	private int age;
	private int x, y;
	private String character;
	public Person(String character,String name, int age, int x, int y)
	{
		this.name = name;
		this.age = age;
		this.x = x;
		this.y = y;
		this.character = character;
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
		return character;
	}
	
}
