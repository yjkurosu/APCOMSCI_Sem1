import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the distance in miles: ");
		int uDistance = kb.nextInt();
		System.out.println("Enter the hours: ");
		int uHours = kb.nextInt();
		System.out.println("Enter the minutes: ");
		int uMinutes = kb.nextInt();
		double mph = 0;
		
		MilesPerHour car = new MilesPerHour(uDistance, uHours, uMinutes, mph);
		
		System.out.println(uDistance + " miles in " + uHours + " hours and " + uMinutes + " minutes = " + car.getMilesPerHour() + " mph");
		
		car.setValues(100, 2, 30);
		System.out.println("100 miles in 2 hours and 30 minutes = " + car.getMilesPerHour() + " mph");
	}
}