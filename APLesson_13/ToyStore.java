import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	static ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String toys)
	{
		loadToys(toys);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy t = getThatToy(name);
			if(t == null)//not on the list of Toys
			{
				;
			    if(type.equals("AF"))
					toyList.add(new AFigure(name));
				else if(type.equals("Car"))
					toyList.add(new Car(name));
			}
			else
				t.setCount(t.getCount() + 1);
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy a : toyList)
		{
			if(a.getName().equals(nm))
				return a;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy a : toyList)
		{
			if(max < a.getCount())
			{
				max = a.getCount();
				name = a.getName();
			}
				
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy a : toyList)
		{
			if(a.getType().equals("Car"))
				cars++;
			else if(a.getType().equals("Action Figures"))
				figures++;	
		}
		
		if(cars > figures)
			return "Cars";
		else if(figures > cars)
			return "Action Figures";
		else
			return "Equals amounts of action figures and cars!";
	}
	
	public String toString()
	{
		String output = "";
		for(Toy t : toyList)
			output += "" + t + " \n";
		return output;
	}
}
