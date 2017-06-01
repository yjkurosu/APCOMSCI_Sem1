/**
 * Created by kurosuy9644 on 5/30/2017.
 */
public class Time
{
    public int remainTime;
    public int startTime;

    public Time(int t1, int t2)
    {
        startTime = t1;
        remainTime = t2;
    }

    public int getRemainTime()
    {
        return remainTime;
    }

    public int getStartTime()
    {
        return startTime;
    }

}
