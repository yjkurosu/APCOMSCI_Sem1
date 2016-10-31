import java.util.Scanner;

public class Lab_06_CountX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int num1 = kb.nextInt();
		System.out.println("Enter another integer: ");
		int num2 = kb.nextInt();
		
		for(int i = num2; i <= num1; i+=num2)
		{
			System.out.printf(i + "	");
		}
		System.out.println(" ");
	}
}