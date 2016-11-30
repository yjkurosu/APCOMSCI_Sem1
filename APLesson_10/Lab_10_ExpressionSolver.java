import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab_10_ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Array.asList(expression.split(" ")));
		System.out.println(doEquation(equation));
	}
	
	public static String doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if(equation.get(i).equals("*"))
				{
					equation.set(i, (Integer.parseInt(equation.get(i-1)) * (Integer.parseInt(equation.get(i+1)))));
				}
				else
				{
					equation.set(i, (Integer.parseInt(equation.get(i-1)) / (Integer.parseInt(equation.get(i+1)))));
				}
                eqaution.remove(i-1);
			    equation.remove(i);
			}
			else
				i++;
		}
	}
}