import java.util.Scanner;

public class Lab_04_2_Average
{
	static int num1;
	static int num2;
	static int num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		num1 = kb.nextInt();
		System.out.println("Please enter the second number: ");
		num2 = kb.nextInt();
		System.out.println("Please enter the third number: ");
		num3 = kb.nextInt();
	    average();
		print();
	}
	public static void average()
	{
		avg = (num1 + num2 +num3) / 3.0;
	}
	public static void print()
	{
	    System.out.printf("The average of %d, %d, and %d is %.5f.\n", num1, num2, num3, avg);
	}
}