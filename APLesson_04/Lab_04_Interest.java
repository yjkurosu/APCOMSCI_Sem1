import java.util.Scanner;

public class Lab_04_Interest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_04_Interest monthpay = new Lab_04_Interest();
		
		System.out.println("Please enter the interest rate in percentages:");
		double rate1 = kb.nextDouble();
		System.out.println("Please enter the principal amount:");
		double principal1 = kb.nextDouble();
		System.out.println("Please enter the number of times the loan is compunded per year:");
		int compound1 = kb.nextInt();
		System.out.println("Please enter the life of the loan in years:");
		int years1 = kb.nextInt();
		System.out.printf("\nYour total monthly payment is $%10.2f\n", monthpay.Monthly(rate1, principal1, compound1, years1));
		
	}
	public double Monthly(double rate, double principal, int compound, int years)
	{
		return (principal * (Math.pow((1+((.01 * rate) / compound)), (compound * years)))) / 12;
	}

}