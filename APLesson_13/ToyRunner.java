import java.util.Scanner;
public class ToyRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		AFigure A1 = new AFigure("Superman");
		Car C1 = new Car("Ferrari");
		System.out.println(A1);
		System.out.println(C1);
	}
}