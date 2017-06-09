public class Player extends Team
{
    private String name;
    private double shootpct;
    private int shotCount;
    private double usage;
    private double threePnt;
    private double threePntUsage;

    Player(String n, double p, double u, double t, double tU)
    {
        name = n;
        shootpct = p;
        shotCount = 0;
        usage = u;
        threePnt = t;
        threePntUsage = tU;

    }

    public String getName()
    {
        return name;
    }

    public double getShootpct()
    {
        return shootpct;
    }

    public int getShotCount()
    {
        return shotCount;
    }

    public int setShotCount(int num)
    {
       return shotCount = num;
    }

    public double getUsage()
    {
        return usage;
    }

    public double getThree() {return threePnt;}

    public double getThreeUsage() {return threePntUsage;}

    public String toString()
    {
        return name;
    }

}
