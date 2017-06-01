/**
 * Created by cooperg2832 on 5/19/2017.
 */
public class SimulationRunner extends PlayerDatabase
{

        public static void main(String[]args)
        {
            System.out.println("Pick a team");
            Simulation s1 = new Simulation();
            s1.gamescore(s1, thunder, warriors);
            System.out.println(s1);
        }




}
