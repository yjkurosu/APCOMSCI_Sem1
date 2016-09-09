public class Lab_02
{
	public static void main(String[]args)
	{
		int a = 5;
		int b = 4;
		int product = a * b;
		
		System.out.println ("5 multiplied by 4 is " + product);
		
		String first_name = "Barack ";
		String last_name = "Obama";
        String address1 = "1600 ";
		String address2 = "Pennsylvania ";
		String address3 = "Avenue";
		String city = "Washington, ";
		String state = "D.C. ";
		String zip = "20500";
		String first_line = first_name + last_name;
		String second_line = address1 + address2 + address3;
		String third_line = city + state + zip;
		
		System.out.println ("\n" + first_line + "\n" + second_line + "\n" + third_line);
		
		int width = 3;
		int length = 3;
		int	height = 3;
		int surface_area = (2 * width * length) + (2 * length *height) + (2 * height * width);
		
		System.out.println ("\n" + "The surface are of your rectangle is " + surface_area);
	}
}