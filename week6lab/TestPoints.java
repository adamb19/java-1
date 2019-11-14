
/**
 * Write a description of class TestPoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPoints
{
    public TestPoints()
    {
        TwoDPoint p1 = new TwoDPoint();
        TwoDPoint p2 = new TwoDPoint(0.0,0.0);
        System.out.println(p1.equals(p2));
        p2.setX(10);
        System.out.println(p1.equals(p2));
    }
    








}
