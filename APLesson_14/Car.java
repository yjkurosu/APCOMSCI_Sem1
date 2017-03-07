public abstract class Car implements Location
{
	int ID;
	
	public Car()
	{
		ID = (int)(Math.random() * 1000000) + 1;
	}
}