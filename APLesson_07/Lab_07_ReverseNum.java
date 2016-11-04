public class Lab_07_ReverseNum
{
	static int number = 3465476;
	static int num = number;
	static int rev = 0;
	
	public static void main(String[]args)
	{
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse()
	{
		while(num > 0)
		{
			rev *= 10;
			rev += (num % 10);
			num /= 10;
		}
	}
}