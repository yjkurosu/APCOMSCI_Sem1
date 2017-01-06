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
		
		MilesPerHour object = new MilesPerHour(uDistance, uHours, uMinutes, mph);
		
		System.out.println(uDistance + " miles in " + uHours + " hours and " + uMinutes + " minutes = " + object.getMilesPerHour() + " mph");
		
	}
}