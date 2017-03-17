public abstract class Car implements Location
{
	final int ID = (int)(Math.random() * 1000000) + 1;
	double[] loc;
	double xCord, yCord;
	
	public Car()
	{
		loc = new double[2];
	}
	
	public int getID()
	{
		return ID;
	}	
	
	public void move(double x, double y)
	{
		loc[0] = x;
		loc[1] = y;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
}