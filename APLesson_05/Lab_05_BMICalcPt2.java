import java.util.Scanner;

public class Lab_05_BMICalcPt2
{
	static double h;
	static double w;
	static double BMI;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hi, welcome to the BMI calculator. Please enter your height in inches.");
		h = kb.nextDouble();
		System.out.println("OK, now please enter you weight in pounds.");
		w = kb.nextDouble();
		BMI = 703 * (w/(h * h));
		String cond = calcCondish();
		
		System.out.printf("Your BMI is %.2f\n", BMI);
		System.out.printf("You are %s\n", cond);
	}
	
	public static String calcCondish()
	{
		if(BMI < 18.5)
			return "Underweight";
		else if(BMI < 25.0)
			return "Normal";
		else if(BMI < 30.0)
			return "Overweight";
		else if(BMI < 35.0)
			return "Obese";
		else if(BMI < 40.0)
			return "Very Obese";
		else if(BMI >= 40.0)
			return "Morbidly Obese";
		else
			return "Unknown";
	}
}