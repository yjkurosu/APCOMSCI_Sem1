public class Simulation
{
    public boolean wentIn(int shotPct)
    {
        private int shot = (int)(Math.random()*100+1);
        if(shot>shotPct)
        {
            return true;
        }
        return false;
    }
    public static void main(String[]args)
    {
        Simulation s1 = new Simulation(40);
        if(s1.wentIn())
        {
            System.out.println("shot made");
        }
        else
            System.out.println("shot missed");

}