import java.util.Scanner;

public class Lab_04_2_Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the lenghth of a side of the cube: ");
		side = kb.nextDouble();
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = 6.0 * (side * side);
	
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with %f unit sides is %.5f.\n", side, sa);
	}
}