import java.util.Scanner;

public class Lab_04_3_Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle: ");
		double r = kb.nextDouble();
		print(r, calcArea(r));
	}
	public static double calcArea(double r)
	{	
		return (r * r) * Math.PI; 
	}
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f.\n", r, area);
	}
}