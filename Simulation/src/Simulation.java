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

    public boolean threes(double threePnt)
    {
        shot = (double)(Math.random()*100+1);
        if(shot<=threePnt)
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
            if(shootThree(p1))
            {

                if(s.wentIn(p1.getThree()))
                {
                    userScore+=3;
                    System.out.println(p1 + " Makes a Three!");
                    possesion = false;
                }
                else
                {
                    homeRebound(t, p1);
                }

            }
            else if (s.wentIn(p1.getShootpct()))
            {
                //System.out.println("home shot made");
                userScore+=2;
                System.out.println(p1 + " Scores!");
                possesion = false;
            }

            else
            {
               homeRebound(t,p1);
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
            if(shootThree(p2))
            {

                if(s.wentIn(p2.getThree()))
                {
                    cpuScore+=3;
                    System.out.println(p2 + " Makes a Three!");
                    possesion = true;
                }
                else
                {
                    awayRebound(t, p2);
                }

            }
            else if(s.wentIn(p2.getShootpct()))
            {
                //System.out.println("away shot made");
                cpuScore += 2;
                System.out.println(p2 + " Scores!");
                possesion = true;
            }
            else
            {
                awayRebound(t,p2);
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
                System.out.println(t1.getName() + " " + userScore + " - " + cpuScore + " " + t2.getName() );
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

    public static boolean shootThree(Player p)
    {
        double num = (double)(Math.random()*100+1);
        if(num<p.getThreeUsage())
        {
            return true;
        }

            return false;

    }

    public static boolean homeRebound(Team t1, Player p)
    {
        possesion = gotReb(t1.getOffRebPct());
        System.out.println(p + " Misses!");
        if(possesion)
        {
            System.out.println(t1.getName() + " gets the rebound!");
            time.shotTime();
        }
        else
        {
            System.out.println("The defense gets the rebound!");
        }
        return possesion;
    }

    public static boolean awayRebound(Team t1, Player p)
    {
        possesion = !gotReb(t1.getOffRebPct());
        System.out.println(p + " Misses!");
        if(!possesion)
        {
            System.out.println(t1.getName() + " gets the rebound!");
            time.shotTime();
        }
        else
        {
            System.out.println("The defense gets the rebound!");
        }
        return possesion;
    }


    public String toString()
    {
        return userScore + "-" + cpuScore;
    }


}