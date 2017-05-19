public class Simulation
{
    private double shot;
    public Simulation()
    {
        double shot = (double)(Math.random()*100+1);
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


}