import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your hair color: ");
		String uHair = kb.next();
		System.out.println("Please enter your eye color: ");
		String uEyes = kb.next();
		System.out.println("Please enter your skin color: ");
		String uSkin = kb.next();
		
		Human human1 = new Human(uHair, uEyes, uSkin);
		System.out.println("My info.....");
		System.out.println("Hair:\t" + human1.getHair());
		System.out.println("Eyes:\t" + human1.getEyes());
		System.out.println("Skin:\t" + human1.getSkin());
		
		human1.setHES("Blonde", "Blue", "White");
		System.out.println("Friend's info.....");
		System.out.println("Hair:\t" + human1.getHair());
		System.out.println("Eyes:\t" + human1.getEyes());
		System.out.println("Skin:\t" + human1.getSkin());
	}
}