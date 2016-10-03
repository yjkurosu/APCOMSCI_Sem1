import java.util.Scanner;

public class Lab_04_3_Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the width in feet: ");
		double w = kb.nextDouble();
		System.out.println("Please enter the length in feet: ");
		double l = kb.nextDouble();
		print(calcPerim(l,w));
		
	}
	public static double calcPerim(double l, double w)
	{
		return (2 * l) + (2 * w);
	
	}
	public static void print(double p)
	{
		System.out.printf("Your rectangle is %.5fft around.\n", p);
	}
}