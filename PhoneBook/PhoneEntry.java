
/**
 * Write a description of class PhoneEntry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhoneEntry
{
    private String name;    // name of a person
    private String number;   // their phone number

    // constructor
    PhoneEntry( String name, String number )
    {
        this.name = name; 
        this.number = number;
    }

    public String getName()
    {
        return name ;
    }

    public String getNumber()
    {
        return number ;
    }

    public void setNumber(String newNumber)
    {
        number = newNumber;
    }

    public boolean equals(Object o)
    {
        if(o=null)
        
        return false;
        if(this==0)
        return true;
        String other=((PhoneEntry)o).getName();
        return name.equals(other);
    }
    private int search(PhoneEntry entry)
    {
        for(int i=0;i<currentSize;i++)
        if(phoneBook[i].equals(entry))
        return i;
        return -1;
    }

    public String toString()
    {
        return "Name: " + getName() + " Number: " + getNumber() ;
    }

}