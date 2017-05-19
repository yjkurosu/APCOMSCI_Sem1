/**
 * Created by cooperg2832 on 5/19/2017.
 */
public class SimulationRunner
{
        public static void main(String[]args)
        {
            Simulation s1 = new Simulation();
            Player PG1 = new Player("Russell Westbrook", 42.5);
            Player SG1 = new Player("Victor Oladipo", 44.2);
            Player SF1 = new Player("Andre Roberson", 46.4);
            Player PF1 = new Player("Domantas Sabonis", 39.9);
            Player C1 = new Player("Steven Adams", 57.1);

            Player PG2 = new Player("Stephen Curry", 46.8);
            Player SG2 = new Player("Klay Thompson", 46.8);
            Player SF2 = new Player("Kevin Durant", 53.7);
            Player PF2 = new Player("Draymond Green", 41.8);
            Player C2 = new Player("Zaza Pachulia", 53.4);
            if (s1.wentIn(PG1.getShootpct())) {
                System.out.println("shot made");
            } else
                System.out.println("shot missed");
        }
}
