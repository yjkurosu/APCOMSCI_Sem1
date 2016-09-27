import java.util.Scanner;

public class Lab_04_Average
{
	static int num1;
	static int num2;
	static int num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_04_Average work = new Lab_04_Average();
		
		System.out.println("Please enter the first number: ");
		num1 = kb.nextInt();
		System.out.println("Please enter the second number: ");
		num2 = kb.nextInt();
		System.out.println("Please enter the third number: ");
		num3 = kb.nextInt();
		work.print(num1, num2, num3, work.average(num1, num2, num3));
	}
	public double average(int num1, int num2, int num3)
	{
		return (num1 + num2 +num3) / 3.0;
	}
	public void print(int num1, int num2, int num3, double avg)
	{
	    System.out.printf("The average of %d, %d, and %d is %.5f.\n", num1, num2, num3, avg);
	}
}