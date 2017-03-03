public class Honda implements Location
{
	private double xCord, yCord;
	
	public Honda()
	{
		xCord = 0;
		yCord = 0;
	}
	
	public Honda(double[] loc)
	{
		xCord = loc[0];
		yCord = loc[1];
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}	
	
	public void move(double x, double y)
	{
		xCord += x;
		yCord += y;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xCord;
		location[1] = yCord;
		return location;
	}
}