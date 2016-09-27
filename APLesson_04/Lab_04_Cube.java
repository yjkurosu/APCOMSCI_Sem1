import java.util.Scanner;

public class Lab_04_Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_04_Cube work = new Lab_04_Cube();
		
		System.out.println("Please enter the lenghth of a side of the cube: ");
		side = kb.nextDouble();
		work.print(side, work.calcSurf(side));
	}
	public double calcSurf(double one)
	{
		return 6 * (side * side);
	
	}
	public void print(double one, double two)
	{
		System.out.printf("The surface area of a cube with %f unit sides is %.5f.\n", one, two);
	}
}