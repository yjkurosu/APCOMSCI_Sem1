public class Simulation
{
    private static Time time = new Time();
    private double shot;
    private static int userScore = 0;
    private static int cpuScore = 0;
    private static boolean possesion = true;
    private static double rebound;
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

    public static void hometeamscore(Simulation s, Team t)
    {
        while(possesion && time.getRemainTime() > 0)
        {
            System.out.println();
            System.out.println(time);
            Player []team = t.getTeam();
            Player p1 = getPlayer(team);
            if (s.wentIn(p1.getShootpct()))
            {
                System.out.println("home shot made");
                userScore+=2;
                System.out.println(p1 + " Scores!");
                possesion = false;
            }

            else
            {
                System.out.println("home shot missed");
                possesion = gotReb(t.getOffRebPct());
                System.out.println(p1 + "Misses!");
                if(possesion)
                {
                    System.out.println(t.getName() + " gets the rebound!");
                    time.shotTime();
                }
            }
            s.playerShot(p1);
        }

    }

    public static void awayteamscore(Simulation s, Team t)
    {
        while (!possesion && time.getRemainTime() > 0)
        {
            System.out.println();
            System.out.println(time);
            Player []team = t.getTeam();
            Player p2 = getPlayer(team);
            if (s.wentIn(p2.getShootpct()))
            {
                System.out.println("away shot made");
                cpuScore += 2;
                System.out.println(p2 + " Scores!");
                possesion = true;
            }
            else
            {
                System.out.println("away shot missed");
                possesion = !gotReb(t.getOffRebPct());
                System.out.println(p2 + "Misses!");
                if(!possesion)
                {
                    System.out.println(t.getName() + " gets the rebound!");
                    time.shotTime();
                }
            }
            s.playerShot(p2);
        }
    }

    public static void gamescore(Simulation s, Team t1, Team t2)
    {
        int quarter = 1;
        while(quarter <= 4)
        {
            time.setRemainTime(time.getStartTime());
            System.out.println("\n\n-----------------------------------------------------Beginning of Quarter " + quarter + "-------------------------------------------------");
            System.out.println(t1.getName() + "  " + userScore + "-" + cpuScore + "  " + t2.getName());
            gamePlay(s, t1, t2);
            System.out.println("-----------------------------------------------------End of Quarter " + quarter + "-------------------------------------------------");
            quarter++;
        }
    }

    public static void gamePlay(Simulation s, Team t1, Team t2)
    {
        while(time.getRemainTime() > 0)
        {

            if(possesion)
            {
                time.shotTime();
                hometeamscore(s, t1);
            }
            else
            {
                time.shotTime();
                awayteamscore(s, t2);
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

    public static boolean gotReb(double rebPct)
    {
        rebound = (double)(Math.random()*100+1);
        if(rebound<=rebPct)
        {
            return true;
        }
        return false;
    }



    public String toString()
    {
        return userScore + "-" + cpuScore;
    }


}