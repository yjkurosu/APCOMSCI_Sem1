import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the x-coordinate of the first point: ");
		int x1 = kb.nextInt();
		System.out.println("Enter the y-coordinate of the first point: ");
		int y1 = kb.nextInt();
		System.out.println("Enter the x-coordinate of the second point: ");
		int x2 = kb.nextInt();
		System.out.println("Enter the y-coordinate of the second point: ");
		int y2 = kb.nextInt();
		
		Distance points = new Distance(x1, y1, x2, y2);
		
		System.out.println("The distance between the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + points.getDist() + ".");
		
		points.setValues(5, 5, 8, 6);
		System.out.println("The distance between the points (5,5) and (8,6) is " + points.getDist() + ".");
	}
}