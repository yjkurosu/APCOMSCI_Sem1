public class Player {
    private String name;
    private double shootpct;

    Player(String n, double p)
    {
        name = n;
        shootpct = p;
    }

    public String getName()
    {
        return name;
    }

    public double getShootpct()
    {
        return shootpct;
    }

    public String toString()
    {
        return name + " has a shooting percentage of " + shootpct + "%!";
    }
}
