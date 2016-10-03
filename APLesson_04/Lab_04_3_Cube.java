import java.util.Scanner;

public class Lab_04_3_Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the lenghth of a side of the cube: ");
		double side = kb.nextDouble();
		print(side, calcSurf(side));
	}
	public static double calcSurf(double side)
	{
		return 6.0 * (side * side);
	
	}
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube with %f unit sides is %.5f.\n", side, sa);
	}
}