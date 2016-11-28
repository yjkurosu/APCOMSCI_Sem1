import java.util.ArrayList;
import java.util.Arrays;

public class Lab_10_KeepComps
{
	static ArrayList<Integer> numList;
	
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		numList = new ArrayList<Integer>(Arrays.asList(numbers));
		gFactor(numList);
		System.out.println(numList);
	}
	
	public static Integer gFactor(Integer n)
	{
		for(int i = 2; i <= n-1; i++)
		{
			if(n % i = 0)
				return 1;
		}
		return 0;
	}
}