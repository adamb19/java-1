import java.util.*;
/**
 * A class to make array for the borrowers
 * 
 * @author Adam Baker/w15009283 
 * @version 3rd version 26/11/2015
 */
public class BorrowerList
{
   private ArrayList<Borrower> borrowers;   // array list of Borrower named borrowers 
   
   /**
    * Constructor for objects of class BorrowerList
    */
   public BorrowerList()
   {
       borrowers = new ArrayList<Borrower>();
   }
   
    /**
     * add Borrower to the array list
     * 
     * @param Borrower borrower
     */
   public void addBorrower(Borrower borrower)
   {
       borrowers.add(borrower);//add a borrower to array list 
   }
    
   /**
    * return the size of the array list
    * @return borrowers.size()
    */
   public int getNumberOfBorrowers()
   {
       return borrowers.size();
   }
    
   /**
    * get the specifed borrower by borrowerEntry
    * if number negative return  negative entry
    * if number is to high return no such entry
    * if right return the borrower details
    * 
    * @param BorrowerEntry
    */
   public void getBorrower(int borrowerEntry)
   {
       if (borrowerEntry < 0)
       {
           System.out.println("Negative entry: " + borrowerEntry);
       }
       else if (borrowerEntry < getNumberOfBorrowers())
       { 
           /**
            * is equal to borrowers entry number 
            * if so print that borrowers details
            */
           Borrower borrower = borrowers.get(borrowerEntry);
           borrower.printBorrowerDetails();
       }
       else
       {
           System.out.println("No such entry: " + borrowerEntry);
       }
   }
    
   /**
    * get all borrowers details in the array list 
    * by using a for each loop
    */
   public void getAllBorrowers()
   {
        for(Borrower borrower : borrowers)
        {
            /**
             * print each borrower with a space between each 1
             */
            borrower.printBorrowerDetails();
            System.out.println();
        }
   }
   
   /**
    * remove the borrower by borrower entry
    * if zero say it is negative
    * if too high say no such entry
    * if right remove that borrower
    * 
    * @param borrowerEntry
    */
   public void removeBorrower(int borrowerEntry)
   {
        if(borrowerEntry < 0)
        {
            System.out.println("Negative entry :" + borrowerEntry);
        }
        else if(borrowerEntry < getNumberOfBorrowers())
        {
            borrowers.remove(borrowerEntry);
        }
        else
        {
            System.out.println("No such entry :" + borrowerEntry);
        }
   }
    
   /**
    * remove borrower by libraryNumber
    * if the library Number is equal to the borrower removwee
    * them from the index
    * 
    * @param libraryNumber
    * 
    * @return true
    * 
    * @return false
    */
   public boolean removeBorrower(String libraryNumber)
   {
        int index = 0;
        for (Borrower borrower: borrowers)
        {
            //if libraryNumber is equal to borrower libraryNumber
            if (libraryNumber.equals(borrower.getLibraryNumber()))
            {
                //remover that borrower form index and return true
                borrowers.remove(index);
                return true;
            }
            index++;
        }
        return false;
   }
    
   /**
    * search for borrower by libraryNumber
    * 
    * @param String libraryNumber
    * 
    * @return index
    * @return -1
    */
   public int search(String libraryNumber)
   {
       int index = 0;
       /**
        * look through borrowers and see if any of them 
        * have the same library number has entered.
        * if there are return index
        * if not return -1
        * 
        */
       for (Borrower borrower : borrowers)
       {
           if (libraryNumber.equals(borrower.getLibraryNumber()))
           {
               return index;
           }
           else
           {
               index++;
           }
       }
       return -1;
   }   
   
   /**
    * get borrower by libraryNumber
    * if found return borrower details and true
    * if not return false
    * 
    * @param String libraryNumber
    * @return true
    * @return false
    */
   public boolean getBorrower(String libraryNumber)
   {
       int index=0;
       for (Borrower borrower:borrowers)
       {
           /**
            * if libarry number equals library number return 
            * true and borrower info but if not return false
            */
            if(libraryNumber.equals(borrower.getLibraryNumber()))
            {
                borrower.printBorrowerDetails();
                return true;
            }
            index++;
       }
       return false;
    }
}
