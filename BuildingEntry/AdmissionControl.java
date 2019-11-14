
/**
 * Write a description of class AdmissionControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdmissionControl
{
    private BoundedCounter noInBuilding;
    
    public AdmissionControl(int maxOccupancy)
    {
        noInBuilding=new BoundedCounter(maxOccupancy);
    }
    public int getNumberInBuilding()
    {
        return noInBuilding.getCount();
    }
    public int getMaxOccupancy()
    {
        return noInBuilding.getMaxAllowed();
    }
    public void enterBuilding()
    {
        boolean success=noInBuilding.incrementCount();
        if(success)
        {
            System.out.println("number in building is"+noInBuilding.getCount());
        }
        else
        {
            System.out.println("no entry building full");
        }
    }
    public void leaveBuilding()
    {
        boolean success=noInBuilding.decrementCount();
        if(success)
        {
            System.out.println("number in building is"+noInBuilding.getCount());
        }
        else
        {
            System.out.println("eror-should be someone in the room");
        }
    }








}
