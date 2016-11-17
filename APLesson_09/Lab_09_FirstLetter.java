import java.util.Scanner;

public class Lab_09_FirstLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		first(words);
	}
	
	public static void first(String[] w)
	{
		for(String word : w)
		{
			System.out.println(word.charAt(0));
		}
	}
}