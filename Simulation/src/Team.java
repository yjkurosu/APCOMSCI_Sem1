/**
 * Created by cooperg2832 on 6/1/2017.
 */
public class Team
{
    private Player PG, SG, SF, PF, C;
    private double offRebPct;
    private String name;

    public Team()
    {
        name = " ";
        offRebPct = 0;
    }

    public Team(Player p1, Player p2, Player p3, Player p4, Player p5, double rebPct, String n)
    {
        PG = p1;
        SG = p2;
        SF = p3;
        PF = p4;
        C =  p5;
        offRebPct = rebPct;
        name = n;

    }

    public String getName()
    {
        return name;
    }

    public double getOffRebPct()
    {
        return offRebPct;
    }

    public Player[] getTeam()
    {
        Player[] team = new Player [5];
        team[0] = PG;
        team[1] = SG;
        team[2] = PF;
        team[3] = SF;
        team[4] = C;
        return team;
    }
    

}
