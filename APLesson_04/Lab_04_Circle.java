import java.util.Scanner;

public class Lab_04_Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_04_Circle work = new Lab_04_Circle();
		
		System.out.println("Please enter the radius of the circle: ");
		r = kb.nextDouble();
		work.print(side, work.calcSurf(side));
	}
	public double calcArea(double one)
	{
		return ;
	
	}
	public void print(double one, double two)
	{
		System.out.printf("The surface area of a cube with %fcm sides is %.5f centimeters squared.\n", one, two);
	}
}