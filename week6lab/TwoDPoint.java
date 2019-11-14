
/**
 * Write a description of class TwoDPoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoDPoint
{
    private double x;
    private double y;
        public TwoDPoint()
        {
           this.x=0;
           this.y=0;
            
        }
        public TwoDPoint(double x,double y)
        {
            this.x=x;
            this.y=y;
        }
        public double getX()
        {
            return x;
        }
        public double getY()
        {
            return y;
        }
        public void setX(double x)
        {
           this.x=x;
        }
        public void setY(double y)
        {
            this.y=y;
        }
        public boolean equals(Object o)
        {
            
            if(o==null)
            
                return false;
            
            if(!(o instanceof TwoDPoint))
                return false;
            TwoDPoint otherPoint = (TwoDPoint)o;
            if((otherPoint.getX()== x)&&(otherPoint.getY()==y))
               return true;
            else
               return false;
        }


        









}
