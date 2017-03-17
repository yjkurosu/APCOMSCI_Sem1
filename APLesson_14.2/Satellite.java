import java.util.*;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));


       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": " + getLocation(l.getLoc());
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": " + getDistance(l.getLoc(), home);
       }

	   
	   printout += "\n\n" + "==========================";
	   
		double x , y;
		
	   for (Location l : locate)
       {
		   x = ((Math.random() * 100) + 1);
		   y = ((Math.random() * 100) + 1);
		   String one = String.format("(%.2f)", x);
		   String two = String.format("(%.2f)", y);
           printout += "\nAfter " + l.getID() + " Moved: " + one + ", " + two;
		   l.move(x,y);
		   printout += "\nNew Location: " + getLocation(l.getLoc()) + "\n";
       }
	   
	   printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

       for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": " + getDistance(l.getLoc(), home);
       }
       System.out.println(printout);
   }


   public static String getDistance(double[] car, double[] home)
   {
       return String.format("(%.2f)", Math.sqrt(Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("(%.2f, %.2f)", loc[0], loc[1]);
   }
}
