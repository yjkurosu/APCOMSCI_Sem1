public class Toyota implements Location
{
	private double xCord, yCord;
	
	public Toyota()
	{
		xCord = 0;
		yCord = 0;
	}
	
	public Toyota(String p)
	{
		String[] loc = p.split(", ");
		xCord = Double.parseDouble(loc[0]);
		yCord = Double.parseDouble(loc[1]);
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