public class Lab_05_Dice
{
	public static void main(String[]args)
	{
		int user = (int)(1 +(Math.random() * 6));
		int com = (int)(1 + (Math.random() * 6));
		
		System.out.printf("You rolled a %d.\n", user);
		System.out.printf("Computer rolled a %d.\n", com);
		rollDice(user, com);
	}
	
	public static void rollDice(int one, int two)
	{
		if(one > two)
			System.out.println("The winner is you.");
		
		if(one < two)
			System.out.println("The winner is computer.");
		
		if(one == two)
			System.out.println("There is no winner, roll again.");
	}
}