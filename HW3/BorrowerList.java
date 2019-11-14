
/**
 * a  array list of a specific amount of borrowers
 * 
 * @author Adam Baker/w15009283 
 * @version version 01 11/11/2015
 */
import java.util.ArrayList;
public class BorrowerList
{
   private ArrayList<Borrower> borrowers;//array list for borrowers
   
   /**constrcutor that is used to 
    * intialise the a new array 
    * list to hold borroer information
    * 
    */
   public BorrowerList()
   {
       borrowers= new ArrayList<Borrower> ();//borrowers is named as new borrower array list
   }
   
   /**
    * a class which adds borrowers to the list
    * @param borrower from borrower class
    */
   public void addBorrower (Borrower borrower)
   {
      borrowers.add(borrower);//new borroer added to array list
   }
   
   /**
    * this class will ask for all borrowers in the array list to be printed of
    */
   public void getAllBorrowers()
   {
       //makes printing each borrower out one by one if the borrower is part of the array list
       for(Borrower borrower:borrowers)
       {
       borrower.printBorrowerDetails();
       }
       
   }
   
   /**
    * gets a specified borrower from the array list 
    * by telling what position in the the array list you want
    * printing out on the page
    * 
    * @param borrowerentry(where in list)
    */
   public void getBorrower(int borrowerEntry)
   {
       
       //if borrower is less than size of array list and bigger than zero just print that array out
       if(borrowerEntry<getNumberOfBorrowers()&& borrowerEntry>=0)
       {
           Borrower borrower=borrowers.get(borrowerEntry);
           
           borrower.printBorrowerDetails();
           
       }
       
  
       else
       {
           //if borrower entry is greater or equal to size say it is to big. if negative say its negative
           if(borrowerEntry >=getNumberOfBorrowers())
           {
         
           System.out.println("the number is invalid has number is too big");
           }
       
           else
            {
              System.out.println("The number is negative");
            }
        }
   }
   /**
    * shows how many are in array list
    * 
    * @return borrowers.size()
    */
   public int getNumberOfBorrowers()
   {
       return borrowers.size();
   }
   
   /**
    * remove borrower from the arraylist by borrowerentry
    * 
    * @param int borrowentry
    */
   public void removeBorrower(int borrowerEntry)
   {
       borrowers.remove(borrowerEntry); 
   }
   
   /**
    * remove borrower by libararynumber
    * @param string  libraryNumber
    * @param int borrowerentry
    * @return true
    * @return false
    */
   public boolean removeBorrower(String libraryNumber)
   {
       int borrowerEntry=0;
       //looks through array list and sees if there are any with a specific libary number
       for(Borrower borrower:borrowers)
       {
           if(libraryNumber.equals (borrower.getLibraryNumber()));
           {
              borrowers.remove(borrowerEntry);
              return true;
           }
           
           
       }
       borrowerEntry++;
       return false;
   }
   
/**
 * search for the libary number
 * @param string libraryNumber
 * @return borrowerEntry
 * return -1
 */
   public int search (String libraryNumber)
   {
       int borrowerEntry=0;
       boolean found= false;
       //while borrower entry is less than  the size of the array list just start if statement
       while (borrowerEntry < getNumberOfBorrowers() && !found)
       {
           Borrower borrower= borrowers.get(borrowerEntry);
           
           //if libary is equal= return true if not return false
           if(borrower.getLibraryNumber().equals(libraryNumber))
           {
               found=true;
           }
           else
           {
              borrowerEntry++;
           }
       }
       if(found==true)
       {
          return borrowerEntry;
       }
       else
       {
          return -1;
       }
   }

       
   
       
   
 
       
  
         
             
        
       
       
       
    

       
   
    








}
