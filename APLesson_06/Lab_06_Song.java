public class Lab_06_Song
{
	public static void main(String[]args)
	{
	    String word1 = "Na";
		int num1 = 4;
		String word2 = "Hey";
		int num2 = 3;
		String word3 = "Goodbye!";
		int num3 = 1;
		
		sing(word1, num1);
		sing(word1, num1);
		sing(word2, num2);
		sing(word3, num3);
	}
	public static void sing(String word, int num)
	{
		for(int i = 1; i <= num; i++)
		{
			System.out.printf(word + " ");
		}
		System.out.println(" ");
	}
}