public class Toyota extends Car
{
	public Toyota(String p)
	{
		loc = new double[2];
		String[] coords = p.split(", ");
		loc[0] = Double.parseDouble(coords[0]);
		loc[1] = Double.parseDouble(coords[1]);
	}
}