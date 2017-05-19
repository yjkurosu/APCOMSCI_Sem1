public class Simulation
{
    private double shot;
    public Simulation()
    {
<<<<<<< HEAD
        int shot = (int)(Math.random()*100+1);
        if(shot>shotPct)
=======
        shot = 0;
    }
    public boolean wentIn(double shotPct)
    {
        shot = (double)(Math.random()*100+1);
        if(shot<=shotPct)
>>>>>>> a4eb2096cf18ea7c3d3233a60dc2da251cb140d4
        {
            return true;
        }
        return false;
    }


}