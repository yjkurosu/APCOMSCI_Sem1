public class Inventory
{
	private String manufacturer, name, category, price; 
	private int upc;
	
	
	public Inventory(String mfr, String nm)
	{
		manufacturer = mfr;
		name = nm;
		category = "N/A";
		upc = (int)(Math.random() * 1000000000) + 1;
		price = "N/A";
	}
	
	public Inventory(String mfr, String nm, String cat, String px)
	{
		manufacturer = mfr;
		name = nm;
		category = cat;
		upc = (int)(Math.random() * 1000000000) + 1;
		price = "$" + px;
	}
	
	public String getMfr()
	{
		return manufacturer;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public String getPrice()
	{
		return price;
	}
	
	public int getUPC()
	{
		return upc;
	}
	
	public String toString()
	{
		return "Item Info...\nManufacturer: " + manufacturer +
							"\nName: " + name +
							"\nCategory: " + category +
							"\nUPC: " + upc +
							"\nPrice: " + price;
	}
}