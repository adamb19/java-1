
/**
 * Write a description of class Pile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pile
{
    private int sticksLeft;
    public Pile(int sticks)
    {
        sticksLeft=sticks;
    }
    public int getSticksleft()
    {
        return sticksLeft;
    }
    public boolean removeSticks(int number)
    {
        if((number>0)&&(number<=sticksLeft))
        {
            sticksLeft=sticksLeft-number;
            return true;
        }
        return false;
    }

    








}
