import java.util.Scanner;

public class Lab_05_GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your grade for Math: ");
		String math = kb.nextLine();
		System.out.println("Please enter your grade for English: ");
		String eng = kb.nextLine();
		System.out.println("Please enter your grade for History: ");
		String hist = kb.nextLine();
		System.out.println("Please enter your grade for Science: ");
		String sci = kb.nextLine();
		System.out.println("Please enter your grade for Art: ");
		String art = kb.nextLine();
		System.out.println("Please enter your grade for PE: ");
		String pe = kb.nextLine();
		System.out.println("Please enter your grade for Computer Science: ");
		String comsci = kb.nextLine();
		
		double totGpts = calcPoints(math) + calcPoints(eng) + calcPoints(hist) + calcPoints(sci) + calcPoints(art) + calcPoints(pe) + calcPoints(comsci);
		double gpa = totGpts / 7;
		System.out.printf("Your GPA is %.2f\n", gpa);
		
		}
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		else
			return 0.0;
	}
}