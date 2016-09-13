import java.util.Scanner;

public class Lab_03_BMICalc
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, welcome to the BMI calculator. Please enter your height in inches.");
		Double h = keyboard.nextDouble();
		System.out.println("OK, now please enter you weight in pounds.");
		Double w = keyboard.nextDouble();
		System.out.println("Now calculating BMI. One moment please...");
		Double value = (703 * (w / (h * h)));
		System.out.println("Your BMI is " + value + ".\nThank you for using the BMI Calculator.");
	}
}