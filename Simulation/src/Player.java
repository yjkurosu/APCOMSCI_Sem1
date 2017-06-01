public class Player extends Team
{
    private String name;
    private double shootpct;
    private int shotCount;
    private double usage;

    Player(String n, double p, double u)
    {
        name = n;
        shootpct = p;
        shotCount = 0;
        usage = u;

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

    public String toString()
    {
        return name + " (" + shotCount + ")";
    }

}
