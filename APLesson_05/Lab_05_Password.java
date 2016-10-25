import java.util.Scanner;

public class Lab_05_Password
{
	static Scanner kb;
	static String userN = "Admin";
	static String passW = "Dolphins";
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Enter your username: ");
		String userN1 = kb.next();
		System.out.println("Enter your password: ");
		String passW1 = kb.next();
		if(userN1.equals(userN) && passW1.equals(passW))
			System.out.println("You are granted access!");
		else
		{
			if(userN1.equals(userN))
			{
				System.out.println("You're password is incorrect! Try again!");
				passCheck();
			}
			else if(passW1.equals(passW))
			{
				System.out.println("Your username is incorrect! Try again!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password are incorrect! Try again!");
				passCheck();
			}	
		}
	}
}