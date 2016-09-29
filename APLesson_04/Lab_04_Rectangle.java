import java.util.Scanner;

public class Lab_04_Rectangle
{
	static double l;
	static double w;
	static double p;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the width in feet: ");
		w = kb.nextDouble();
		System.out.println("Please enter the length in feet: ");
		l = kb.nextDouble();
		calcPerim();
		print();
		
	}
	public static void calcPerim()
	{
		p = (2 * l) + (2 * w);
	
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %.5fft around.\n", p);
	}
}
