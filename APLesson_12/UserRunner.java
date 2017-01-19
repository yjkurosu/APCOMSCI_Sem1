import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String uFirst = kb.next();
		System.out.println("Please enter your last name: ");
		String uLast = kb.next();
		System.out.println("Would you like to use a public avatar? (Y or N): ");
		String yOrN = kb.next();
		
		if(yOrN.equals("Y"))
		{
			System.out.println("Please enter your avatar name: ");
			String uAvatar = kb.next();
			User wAV = new User(uFirst, uLast, uAvatar);
			System.out.println(wAV);
		}
		else
		{
			User woAV = new User(uFirst, uLast);
			System.out.println(woAV);
		}
	}
}