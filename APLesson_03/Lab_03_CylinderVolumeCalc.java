import java.util.Scanner;

public class Lab_03_CylinderVolumeCalc
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello, welcome to the Cylinder Volume Calculator.\nFirst, please enter the radius of the cylinder.");
		Double r = keyboard.nextDouble();
		System.out.println("OK, now please enter the height of the cylinder.");
		Double h = keyboard.nextDouble();
		System.out.println("Calculating cylinderical volume. One moment please...");
		Double volume = Math.PI * r * r * h;
		System.out.println("The volume of the cylinder is " + volume + ".\nThank you for using the Cylinder Volume Calculator");
	}
}