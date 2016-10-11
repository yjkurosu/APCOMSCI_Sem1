import java.util.Scanner;

public class Lab_05_Discount
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 4:");
		String item4 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price4 = kb.nextDouble();
		kb.nextLine();
		
		double subtot = price1 + price2 + price3 + price4;
		double disc = discount(subtot);
		double newSubtot = subtot - disc;
		double tax = newSubtot * .08;
		double tot = newSubtot + tax;
		
		System.out.printf("\n\n%47s", "<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>>>\n");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal", subtot);
		format("Discount", disc);
		format("Tax", tax);
		format("Total", tot);
		System.out.printf("\n%47s", "_______________________________________________\n");
		System.out.printf("\n\n%47s", "Thank you for shopping with us!      \n");
	}
	
	public static double discount(double one)
	{
		if(one >= 2000)
			return .15 * one;
		
		if(one < 2000)
			return 0;
		
		return 0;
	}
	
	public static void format(String one, double two)
	{
		System.out.printf("\n* %20s ........       %3.2f", one, two);
	}
}