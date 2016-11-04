public class Lab_07_ReplaceAts
{
	static String sentence = "Jack has a black car, a black jacket, and a black hat.";
	
	public static void main(String[]args)
	{
		replace();
		System.out.println(sentence);
	}
	public static void replace()
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") + 1);
		}
	}
}