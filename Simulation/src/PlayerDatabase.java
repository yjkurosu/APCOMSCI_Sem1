/**
 * Created by cooperg2832 on 6/1/2017.
 */
public class PlayerDatabase
{
        static Player PG1 = new Player("Russell Westbrook", 42.5, 41.7);
        static Player SG1 = new Player("Victor Oladipo", 44.2, 21.4);
        static Player SF1 = new Player("Andre Roberson", 46.4, 10.1);
        static Player PF1 = new Player("Domantas Sabonis", 39.9, 15.4);
        static Player C1 = new Player("Steven Adams", 57.1, 16.2);

        static Player PG2 = new Player("Stephen Curry", 46.8, 30.1);
        static Player SG2 = new Player("Klay Thompson", 46.8, 26.1);
        static Player SF2 = new Player("Kevin Durant", 53.7, 27.8);
        static Player PF2 = new Player("Draymond Green", 41.8, 16.2);
        static Player C2 = new Player("Zaza Pachulia", 53.4, 15.3);

        static Team thunder = new Team(PG1, SG1, SF1, PF1, C1, 27.8, "Thunder");
        static Team warriors = new Team(PG2, SG2, SF2, PF2, C2, 22.5, "Warriors");
}
