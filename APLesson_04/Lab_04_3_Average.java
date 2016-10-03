import java.util.Scanner;

public class Lab_04_3_Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		int num1 = kb.nextInt();
		System.out.println("Please enter the second number: ");
		int num2 = kb.nextInt();
		System.out.println("Please enter the third number: ");
		int num3 = kb.nextInt();
		print(num1, num2, num3, average(num1, num2, num3));
	}
	public static double average(int one, int two, int three)
	{
		return (one + two +three) / 3.0;
	}
	public static void print(int one, int two, int three, double avg)
	{
	    System.out.printf("The average of %d, %d, and %d is %.5f.\n", one, two, three, avg);
	}
}