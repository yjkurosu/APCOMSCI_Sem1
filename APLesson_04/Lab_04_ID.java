import java.util.Scanner;

public class Lab_04_ID
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_04_ID form = new Lab_04_ID();
		
		System.out.println("Enter your first name:");
		String name1 = kb.nextLine();
		System.out.println("Enter your last name:");
		String name2 = kb.nextLine();
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		System.out.println("Enter the school site:");
		String school = kb.nextLine();
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.printf("\n\n%45s", "*********************************************" );
		form.format(school, year, name1, name2, title, subject);
		System.out.printf("\n%45s\n", "*********************************************");
		
	}
	public void format(String school, String year, String name1, String name2, String title, String subject)
	{
		System.out.printf("\n* %20s %20s *\n* %20s %20s *\n* %20s %20s *", school, year, name1, name2, title, subject);
	}
}