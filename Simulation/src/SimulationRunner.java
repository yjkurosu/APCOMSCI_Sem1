/**
 * Created by cooperg2832 on 5/19/2017.
 */
import java.util.Scanner;
public class SimulationRunner extends PlayerDatabase
{

static Scanner kb = new Scanner(System.in);
        public static void main(String[]args)
        {
            Simulation s1 = new Simulation();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            Time t1 = new Time();
            s1.gamescore(s1, thunder, warriors);
            System.out.println(s1);
=======
=======
>>>>>>> 900ac7a6d7630f561a205790c73fcbc229901537
=======
>>>>>>> 900ac7a6d7630f561a205790c73fcbc229901537
            PlayerDatabase HOME = new PlayerDatabase();
            PlayerDatabase AWAY = new PlayerDatabase();
            System.out.println("Pick a home team from the following: Warriors, Cavaliers, Lakers, Spurs, Thunder, Bulls, Celtics, Knicks, Raptors, Heat");
            String home = kb.nextLine();
            System.out.println("Pick an away team from the following: Warriors, Cavaliers, Lakers, Spurs, Thunder, Bulls, Celtics, Knicks, Raptors, Heat");
            String away = kb.nextLine();
            String[] NBA = {"Warriors", "Cavaliers", "Lakers", "Spurs", "Thunder", "Bulls", "Celtics", "Knicks", "Raptors", "Heat"};
            for(String team : NBA)
            {
                if(home.equals(team))
                {
                    s1.gamescore(s1, HOME.returnTeam(home), AWAY.returnTeam(away));
                    System.out.println(s1);
                }
            }

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 900ac7a6d7630f561a205790c73fcbc229901537
=======
>>>>>>> 900ac7a6d7630f561a205790c73fcbc229901537
=======
>>>>>>> 900ac7a6d7630f561a205790c73fcbc229901537
        }




}
