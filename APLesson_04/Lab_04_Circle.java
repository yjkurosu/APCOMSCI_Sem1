import java.util.Scanner;

public class Lab_04_Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle: ");
		r = kb.nextDouble();
		calcArea();
		print();
	}
	public static void calcArea()
	{
		
		
		area = (r * r) * Math.PI; 
	}
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f.\n", r, area);
	}
}