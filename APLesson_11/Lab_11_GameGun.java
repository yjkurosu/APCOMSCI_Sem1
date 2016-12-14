import java.util.Scanner;

public class Lab_11_GameGun
{
	static int bulletCount = 96;
	static int CLIPSIZE = 16;
	static int shotCount = 0;
	static String[] clip;
	
	public static void main(String[]args)
	{
		clip = new String[CLIPSIZE];
		Scanner kb = new Scanner(System.in);
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String act = kb.next();
			
			if(act.equals("R"))
				reload();
			else if(act.equals("S"))
				System.out.println(shoot());
			printClip();
		}
		
		System.out.println("Out of Bullets");
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
			clip[i] = "[]";
	}
	
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			return "Boom";
		}
		else
			return "Reload";
	}
	
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		
		resetClip();
		for(int i = 0; i < shotCount; i++)
			clip[i] = " * ";
	}
	
	public static void printClip()
	{
		String output = "";
		output += "Bullets:	" + bulletCount + "\nClip:	";
		for(int i = 0; i < CLIPSIZE; i++)
			output += clip[i];
		System.out.println(output);	
	}
}