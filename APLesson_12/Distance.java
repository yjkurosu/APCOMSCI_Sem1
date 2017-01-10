import java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int xUno, int yUno, int xDos, int yDos)
	{
		xOne = xUno;
		yOne = yUno;
		xTwo = xDos;
		yTwo = yDos;
		distance = 0;
	}
	
	public void setValues(int xUno, int yUno, int xDos, int yDos)
	{
		xOne = xUno;
		yOne = yUno;
		xTwo = xDos;
		yTwo = yDos;
		distance = 0;
	}
	
	public double getDist()
	{
		return distance = Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
	}
}