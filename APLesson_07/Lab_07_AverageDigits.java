public class Lab_07_AverageDigits
{
	static int number = 34545643;
	static int digits = 0;
	static int average = 0;
	static int calcAve;
	
	public static void main(String[]args)
	{
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