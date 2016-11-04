public class Lab_07_DigitAdder
{
	static int number = 498608360;
	static int sum = 0;
	static int num = number;
	
	public static void main(String[]args)
	{
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	public static void sumDigits()
	{
		while(num > 0)
		{
			sum += (num % 10);
			num /= 10;
		}
	}
}