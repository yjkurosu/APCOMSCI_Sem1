public class Simulation
{
    private double shot;
    public static int userScore = 0;
    public static int cpuScore = 0;
    public static boolean possesion = true;
    public Simulation()
    {
        double shot = 0;
    }

    public boolean wentIn(double shotPct)
    {
        shot = (double)(Math.random()*100+1);
        if(shot<=shotPct)
        {
            return true;
        }
        return false;
    }

    public static void hometeamscore(Simulation s, Player[] team)
    {
        int homeShotCount=0;
        while(possesion && userScore <= 100 && cpuScore <= 100)
        {
            Player p1 = getPlayer(team);
            if (s.wentIn(p1.getShootpct()))
            {
                System.out.println("home shot made");
                userScore+=2;
                System.out.println(p1 + " Scores!");
            }

            else
            {
                System.out.println("home shot missed");
                possesion = false;
                System.out.println(p1 + "Misses!");

            }
            s.playerShot(p1);
        }

    }

    public static void awayteamscore(Simulation s, Player[] team)
    {
        while (!possesion && cpuScore <= 100 && userScore <= 100)
        {
            Player p2 = getPlayer(team);
            if (s.wentIn(p2.getShootpct()))
            {
                System.out.println("away shot made");
                cpuScore += 2;
                System.out.println(p2 + " Scores!");
            }
            else
            {
                System.out.println("away shot missed");
                possesion = true;
                System.out.println(p2 + "Misses!");

            }
            s.playerShot(p2);
        }
    }

    public static void gamescore(Simulation s, Player[] team1, Player[] team2)
    {
        while(userScore<=100 && cpuScore<=100)
        {

            if(possesion)
            {
                hometeamscore(s, team1);
            }
            else
            {
                awayteamscore(s, team2);
            }
        }
    }

    public static Player getPlayer(Player[] arr)
    {
        int p = (int) (Math.random() * 5);
        int r = (int)(Math.random() * 100 + 1);
        if (r <= arr[p].getUsage())
        {
            return arr[p];
        }
        else
        {
            return getPlayer(arr);
        }
    }


    public static int playerShot(Player p)
    {
        return p.setShotCount(p.getShotCount() + 1);
    }

    public String toString()
    {
        return userScore + "-" + cpuScore;
    }


}