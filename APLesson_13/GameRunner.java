public class GameRunner
{
	public static void main(String[]args)
	{
		XBox x1 = new XBox("XBox");
		PlayStation ps1 = new PlayStation("PlayStation");
		PC pc1 = new PC("PC");
		System.out.println(x1);
		System.out.println(ps1);
		System.out.println(pc1);
	}
}