import java.util.Scanner;

public class Lab_06_GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int in = kb.nextInt();
		System.out.println("Please enter how many values are in the table: ");
		int size = kb.nextInt();
		
		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%10s | %10s\n", i, in * i);
		}
			
	}
}