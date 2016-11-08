import java.util.Scanner;

public class Lab_07_AverageDigits
{
	static int number;
	static int digits = 0;
	static int average = 0;
	static int calcAve;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + calcAve);
	}
	public static void avDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average += (num % 10);
			num /= 10;
		}
		calcAve = average / digits;
	}
}