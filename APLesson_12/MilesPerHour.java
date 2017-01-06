import java.lang.Math.*;
import java.util.Scanner;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int dist, int hrs, int min, double mph)
	{
		distance = dist;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	
	public void setDistance(int dist)
	{
		distance = dist;
	}
	
	public void setHours(int hrs)
	{
		hours = hrs;
	}
	
	public void setMinutes(int min)
	{
		minutes = min;
	}
	
	public double getMilesPerHour()
	{
		return mph = Math.round(distance / (hours + minutes / 60.0));
	}
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the distance in miles: ");
		int uDistance = kb.nextInt();
		System.out.println("Enter the hours: ");
		int uHours = kb.nextInt();
		System.out.println("Enter the minutes: ");
		int uMinutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(uDistance, uHours, uMinutes, mph);
		
		System.out.println(uDistance + " miles in " + uHours + " hours and " + uMinutes + " minutes = " + object.getMilesPerHour() + " mph");
	}
}