import java.util.ArrayList;
import java.util.Arrays;

public class Lab_10_KeepComps
{
	static ArrayList<Integer> numList;
	
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		numList = new ArrayList<Integer>(Arrays.asList(numbers));
		System.out.println(numList);
		removePrimes();
	}
	
	public static int gFactor(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
				return 1;
		}
		return 0;
	}
	
	public static void removePrimes()
	{
		for(int i = 0; i < numList.size(); i++)
		{
			if(gFactor(numList.get(i)) == 0)
			{
				numList.remove(numList.get(i));
			}
		}
		System.out.println(numList);

	}
}