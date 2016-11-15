import java.util.Scanner;

public class Lab_08_TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word1 = kb.next();
		int start1 = 0;
		int stop1 = word1.length();
		tree(word1, start1, stop1);
	}
		
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%15s\n", word.substring(0, start));
			start += 1;
			tree(word, start, stop);
		}
	}
}
