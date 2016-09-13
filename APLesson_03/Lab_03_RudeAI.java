import java.util.Scanner;

public class Lab_03_RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi my name is RudeAI\nI'd like to ask you a few questions\nWhat is your name?");
		String name = keyboard.nextLine();
		System.out.println(name + "?!!! Why would anyone name a baby that?");
		System.out.println("How old are you, " + name + "?");
		String age = keyboard.nextLine();
		System.out.println("Oooooo!!! " + age + " is getting up there.");
        System.out.println("What do you do for fun, " + name + "?");
		String hobby = keyboard.nextLine();
		System.out.println("I thought only nerds like to " + hobby + "?");
		System.out.println("What kind of music do you like?");
		String music = keyboard.nextLine();
		System.out.println("Boooo!!! I wouldn't wish the sound of " + music + " on my worst enemy.");
		System.out.println("How many siblings do you have?");
		String sibling = keyboard.nextLine();
		System.out.println(sibling + "? Wow, I hope the rest of your family is better looking.");
		System.out.println("What do you want to be when you grow up?");
		String career = keyboard.nextLine();
		System.out.println("I'd think you have to be smarter to be a " + career + ".");
		System.out.println("So " + name + ", you're " + age + "...");
		System.out.println("You like to " + hobby + " and listen to " + music + "...");
		System.out.println("Good luck becoming a " + career + ".");
		System.out.println("I'm only kiddin' " + name + ".");
	}
} 