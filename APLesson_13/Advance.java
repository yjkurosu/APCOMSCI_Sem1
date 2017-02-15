public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance()
	{
		super();
		this.daysLeft = 0;
	}
	
	public Advance(int dl)
	{
		super();
		this.daysLeft = dl;
	}
	
	public double getPrice()
	{
		if(daysLeft >= 10)
			return 30.00;
		else
			return 40.00;
	}
}