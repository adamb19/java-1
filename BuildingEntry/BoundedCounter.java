/**
 * A simple counter.
 * 
 * This version of Counter is that amended during 
 * week 3's lectoral. 
 * 
 * It includes decrementCount() which uses selection.
 * 
 * @author Ian Bradley 
 * @version 2.0
 */
public class BoundedCounter
{
   
    private int count;
    private int maxAllowed;

    /**
     * Constructor for objects of class Counter
     * Sets count to 0.
     */
    public BoundedCounter(int maxCount)
    {
        count = 0;
        maxAllowed=maxCount;
    }

   /**
   * Return  value of counter.
   * 
   * @return current value of count
   */
    public int getCount()
    {
        return count;
    }
    
   /**
    * adds 1 to the counter.
    */
    public boolean incrementCount()
    {
        if(count< maxAllowed)
        {
            count = count + 1;
            return true;
        }
        else
        {
            return false;
        
        }
    }
    
    /**
     * sets the counter to 0.
     */
    public void resetCount()
    {
        count = 0 ;
    }
    /**
     *  set the maxinum of what is allowed
     */
    public int getMaxAllowed()
    {
        return maxAllowed;
    }
    
     /**
     * Subtract 1 from count as long at this
     * wll not cause a negative result
     *
     * Alternate version of decrementCount introduced
     * in Week 3 Slide 29
     * 
     * @return whether the operation was successful
     */
    
    public boolean decrementCount()
    {
        if (count > 0 )
        {
            count = count - 1;
            return true;
        }       
        else
        {
            return false;
        }	
    }
}



