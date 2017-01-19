import java.util.Scanner;
public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the manufacturer of the item: ");
		String uMfr = kb.next();
		System.out.println("Please enter the item name: ");
		String uName = kb.next();
		System.out.println("Will you be entering the category and price info? (Y or N)");
		String yOrN = kb.next();
		
		if(yOrN.equals("Y"))
		{
			System.out.println("Please enter the category of the item: ");
			String uCat = kb.next();
			System.out.println("Please enter the item price: ");
			String uPrice = kb.next();
			Inventory wCnP = new Inventory(uMfr, uName, uCat, uPrice);
			System.out.println(wCnP);
		}
		else
		{
			Inventory nCnP = new Inventory(uMfr, uName);
			System.out.println(nCnP);
		}
	}
}