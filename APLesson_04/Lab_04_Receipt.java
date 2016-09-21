import java.util.Scanner;

public class Lab_04_Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_04_Receipt form = new Lab_04_Receipt();
		
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
		double subtot = price1 + price2 + price3;
		double tax = subtot * .08;
		double tot = subtot + tax;
		
		System.out.printf("\n\n%43s", "<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n\n");
		form.format("Subtotal", subtot);
		form.format("Tax", tax);
		form.format("Total", tot);
		System.out.printf("\n%43s", "___________________________________________");
	    System.out.println("\n* Thank you for your support *\n");
	}
	public void format(String item, double price)
	{
		System.out.printf("\n* %20s ........       %3.2f", item, price);
	}
}