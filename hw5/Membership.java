
/**
 * this is an array class for the borrower class
 * 
 * @author w15009283 adam baker
 * @version version1 10/12/2015
 */
public class Membership
{
    private Borrower[] borrowers;//borrowers is an array of the Borrower class
    private int currentIndex;//Currentindex is deifined as an int
    
    /**
     * constructor will define size of borrowers to the value given to macnoofborrowers and make current index = 0
     * 
     * @param int maxnoOfBorrowers
     */
    
    public Membership(int maxnoOfBorrowers)
    {
        borrowers= new Borrower[maxnoOfBorrowers];
        currentIndex=0;
    }
    
    /**
     * this metrhod will add the borrower to  the array
     */
    public void addBorrower(Borrower borrower)
    {
        //if current index is less than or equal to borrowers length add a borrower if not return membership full
        if(currentIndex<=borrowers.length)
        {
            borrowers[currentIndex++]=borrower;
        }
        else
        {
        System.out.println("Membership full. Could not add borrower!");
        }
    }
    
    /**
     * get the capcity of the array
     * 
     * @return currentInddex
     */
    public int getCapacity()
    {
        return borrowers.length;
    }
    
    /**]
     * get the number of borrowers
     * 
     * @return currentIndex
     */
    public int getNumberOfBorrowers()
    {
        return currentIndex;
    }
    
    /**
     * this method print borrower with given library number
     * 
     * @param libraryNumber
     * 
     * @return true
     * @return false
     */
    public boolean printBorrower(String libraryNumber)
    {
        //go through the array and look at the library number of each item
        for(int i=0;i<currentIndex;i++)
        {
            //if it is equal to what you entered print that borrowers details 
            if(borrowers[i].getLibraryNumber().equals(libraryNumber))
            {
                borrowers[i].printBorrowerDetails();
                return true;
            }
        }
        //if false print borrower with librarynumber not found and return false
        System.out.println("Borrower with library number: "+libraryNumber+ " not found");
        return false;
    }
    
    /**
     * this method with print all the borrowers in the array 
     */
    public void printAllBorrowers()
    {
        //go through array and print the items details
        for(int i=0;i<currentIndex;i++)
        {
             borrowers[i].printBorrowerDetails();
        }
    }
      
    /**
     * this method will remove a borrower with libraryNumber
     * 
     * @param libraryNumber
     * 
     * @return true if libraryNumber found and then squash the method
     * 
     * @return false when the librarynumber cannot be found
     */
    public boolean removeBorrower(String libraryNumber)
    {
        //look through the array and if library number is equal remove item and squash array
        for(int i=0;i<currentIndex;i++)
        {
            if(borrowers[i].getLibraryNumber().equals(libraryNumber))
            {
                squash(currentIndex);
                return true;
            }
        }
        //if false return false
        return false;
    
    }
    
    /**
     * this method will squash the array down 
     * when one item array is removed
     * 
     * @param int index
     * 
     */
    private void squash(int index)
    {
        //if index is greater or equal to 0 look through array and squash array by one if one item has not been placed
        if (index >= 0 )
        {
            for ( int i = index ; i < currentIndex - 1 ; i++)
            {
                borrowers[i]= borrowers[i+1];
            }
            borrowers[ currentIndex - 1] = null;//if there are no empty spaces don't do anything
            currentIndex--;
        }
        
    }
    
    /**
     * this method will search for an item in the array
     * with the given library Number
     * 
     * @return if found return the index of where it was found
     * @return if not found return -1
     */
    public int search(String libraryNumber)
    {
        //look through array for librarynumber the same as what you entered if found return index number if found return -1
        for(int i=0;i<currentIndex;i++)
        {
            if(borrowers[i].getLibraryNumber().equals(libraryNumber))
            {
                return i;
            }
        }
        return -1;
    }
    








}
