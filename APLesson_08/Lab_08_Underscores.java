import java.util.Scanner;

public class Lab_08_Underscores
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
	    System.out.println(replace(sentence));
	}
	
	public static String replace(String sen)
	{
		if(sen.indexOf(" ") < 0)
		{
			return sen;
		}
		else{
			return replace(sen.substring(0, sen.indexOf(" ")) + "_" + sen.substring(sen.indexOf(" ") + 1));

		}
	}
}