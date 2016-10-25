import java.util.Scanner;

public class Lab_05_Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	    System.out.println("Welcome to Space Race! You are going on a voyage to Mars!\nFirst off, choose where you wish to travel to." +
		                  "\n     A....Mars" +
						  "\n     B....the Moon");
		String choice1 = kb.next();
		if(choice1.equals("A"))
		{
			System.out.println("OK! It seems like you're ready! Let's go 3.. 2.. 1..\nWait! The space shuttle wont launch! What should you do?" +
			                   "\n      A.....Press the liftoff button again." +
							   "\n      B.....Get out the shuttle and check out the problem.");
			String choice2 = kb.next();
			if(choice2.equals("B"))
			{
				System.out.println("OK! Good! We fixed the problem and now we're in space." +
				                   "\nOh no! There's a metroid rush coming our way! What should we do?" +
				                   "\n     A.....Try to maneuver through the meteroids to save fuel." +
								   "\n     B.....Steer clear of the meteroids and risk running out of fuel.");
								   String choice3 = kb.next();
								   if(choice3.equals("A"))
								   {
									   System.out.println("Good job! It looks like we got through it!\nOh wait! look at that! Congratulations you have successfully reached Mars!\nYou are now part of human history!");
								   }   
								   else
								   {
									   System.out.println("Oh no! Bad Choice! Your bad decision-making cost you your life.");
								   }
			}
			else
			{
				System.out.println("Oh no! Bad Choice! You blew yourslef up!");
			}
		}	
       else 
	   {
		   System.out.println("OK! It seems like you're ready! Let's go 3.. 2.. 1..\nWait! The space shuttle wont launch! What should you do?" +
			                   "\n      A.....Press the liftoff button again." +
							   "\n      B.....Get out the shuttle and check out the problem.");
			String choice2 = kb.next();
			if(choice2.equals("B"))
			{
				System.out.println("OK! Good! We fixed the problem and now we're in space." +
				                   "\nOh no! There's a metroid rush coming our way! What should we do?" +
				                   "\n     A.....Try to maneuver through the meteroids to save fuel." +
								   "\n     B.....Steer clear of the meteroids and risk running out of fuel.");
								   String choice3 = kb.next();
								   if(choice3.equals("A"))
								   {
									   System.out.println("Good job! It looks like we got through it!\nOh wait! look at that! Congratulations you have successfully reached the Moon!\nYou are now part of human history!");
								   }   
								   else
								   {
									   System.out.println("Oh no! Bad Choice! Your bad decision-making cost you your life.");
								   }
			}
			else
			{
				System.out.println("Oh no! Bad Choice! You blew yourslef up!");
			}
	   }
	}
}