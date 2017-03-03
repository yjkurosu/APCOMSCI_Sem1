public class GMC implements Location
{
	private double xCord, yCord;
	
	public GMC()
	{
		xCord = 0;
		yCord = 0;
	}
	
	public GMC(double x, double y)
	{
		xCord = x;
		yCord = y;
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