import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the car's paint color: ");
		String uPaint = kb.nextLine();
		System.out.println("Please enter the car's interior type: ");
		String uInterior = kb.nextLine();
		System.out.println("Please enter the car's engine type: ");
		String uEngine = kb.nextLine();
		System.out.println("Please enter the car's tires: ");
		String uTires = kb.nextLine();
		
		Car car1 = new Car(uPaint, uInterior, uEngine, uTires);
		System.out.println("Your vehicle is ready.....");
		System.out.println("Paint:\t\t" + car1.getPaint());
		System.out.println("Interior:\t\t" + car1.getInterior());
		System.out.println("Engine:\t\t" + car1.getEngine());
		System.out.println("Tires:\t\t" + car1.getTires());
		
		car1.setCustom("Red w/gold fleck", "Corinthian leather (Brown)", "5 litre v8 507hp", "20\" Priellis");
		System.out.println("Your vehicle is ready.....");
		System.out.println("Paint:\t\t" + car1.getPaint());
		System.out.println("Interior:\t\t" + car1.getInterior());
		System.out.println("Engine:\t\t" + car1.getEngine());
		System.out.println("Tires:\t\t" + car1.getTires());
	}
}