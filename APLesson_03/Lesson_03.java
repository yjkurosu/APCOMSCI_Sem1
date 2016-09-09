import java.util.Scanner; //import Scanner

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Who is your favorite teacher? ");
	
		//search for the next integer that the user enters
		String teacher = keyboard.nextLine();
		
		//print the results...
		System.out.println("Okay! " + teacher + " is very good.");
	}
}