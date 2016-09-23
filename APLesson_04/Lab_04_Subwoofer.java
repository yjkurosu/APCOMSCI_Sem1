import java.util.Scanner;

public class Lab_04_Subwoofer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_04_Subwoofer boxVol = new Lab_04_Subwoofer();
		
		System.out.println("Please enter the height of the box in inches:");
		int h = kb.nextInt();
		System.out.println("Please enter the length of the box in inches:");
		int l = kb.nextInt();
		System.out.println("Please enter the width of the box in inches:");
		int w = kb.nextInt();
		System.out.printf("The volume of the box is %5.2f cubic feet.\n", boxVol.calcVol(h,l,w));
	}
	public double calcVol(int h, int l, int w)
	{
		return (h * l * w) / 1728.0;
	}
}