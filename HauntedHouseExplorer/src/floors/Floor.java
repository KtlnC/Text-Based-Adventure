package floors;

public abstract class Floor {

	private int row,column;
	Floor(int row,int column)
	{
		this.row = row;
		this.column = column;
	}
	public abstract void print();
		
	
	
	
}
