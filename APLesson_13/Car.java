public class Car extends Toy
{
	private String name;
	private int count;
	
	
	
	public Car()
	{
		super();
	}
	
	public Car(String n)
	{
		super(n);
	}
	
	public String getType()
	{
		return "Car";
	}
	
	public String toString()
	{
		 return super.toString();
	}
}