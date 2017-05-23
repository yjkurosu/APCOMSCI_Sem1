/**
 * Created by cooperg2832 on 5/19/2017.
 */
public class SimulationRunner
{

        public static void main(String[]args)
        {
            Simulation s1 = new Simulation();
            Player PG1 = new Player("Russell Westbrook", 42.5, 41.7);
            Player SG1 = new Player("Victor Oladipo", 44.2, 21.4);
            Player SF1 = new Player("Andre Roberson", 46.4, 10.1);
            Player PF1 = new Player("Domantas Sabonis", 39.9, 15.4);
            Player C1 = new Player("Steven Adams", 57.1, 16.2);

            Player PG2 = new Player("Stephen Curry", 46.8, 30.1);
            Player SG2 = new Player("Klay Thompson", 46.8, 26.1);
            Player SF2 = new Player("Kevin Durant", 53.7, 27.8);
            Player PF2 = new Player("Draymond Green", 41.8, 16.2);
            Player C2 = new Player("Zaza Pachulia", 53.4, 15.3);


            Player[] thunder = {PG1, SG1, SF1, PF1, C1};
            Player[] warriors = {PG2, SG2, SF2, PF2, C2};

            s1.gamescore(s1, thunder, warriors);
            System.out.println(s1);
        }




}
