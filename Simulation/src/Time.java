/**
 * Created by kurosuy9644 on 5/30/2017.
 */
public class Time
{
    public int remainTime;
    public int startTime;

    public Time()
    {
        startTime = 720;
        remainTime = 720;
    }

    public Time(int t1)
    {
        startTime = 720;
        remainTime = t1;
    }

    public int getRemainTime()
    {
        return remainTime;
    }

    public int getStartTime()
    {
        return startTime;
    }

    public int setRemainTime(int t)
    {
        return remainTime = t;
    }

    public int shotTime()
    {
        return remainTime -= (int)((Math.random() * 20) + 5);
    }



    public int convertMin(int t)
    {
        return t/60;
    }

    public int convertSec(int t)
    {
        return t%60;
    }

    public String toString()
    {
        return String.format("%02d:%02d", convertMin(remainTime), convertSec(remainTime));
    }

}
