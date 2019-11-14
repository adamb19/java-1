
/**
 * text based userface for borrowers
 * 
 * @author w15009283/ adam baker 
 * @version 1st version 26/11/2015
 */
import java.util.Scanner;//this will allow you to use the scanner methods
public class BorrowerTUI
{
    private BorrowerList borrowerList;//borrowlist class will help get information from that class
    private Scanner myScanner;//allows you to scan information and use it
    
    /**
     * this constructor will assign borrowlist as a new version 
     * of class BorrowerList and assign myScanner has new scanner
     */
    public BorrowerTUI()
    {
        borrowerList= new BorrowerList();
        myScanner= new Scanner(System.in);
    }
    
    /**
     * the menu will tell the text based what 
     * to do while the command is not equal to ero
     */
    public void menu()
    {
        int command = -1;//command will set to -1 to start so no function will happen
        while(command != 0)
        {
            /**the program will look up the display menu and
             * see what corresponds to the button 
             * you clicked and execute that method
             */ 
             displayMenu();
             command=getCommand();
             execute(command);
      
        }
    }
    
    /**
     * This method will display what the option are to the user 
     */
    public void displayMenu()
    {
        System.out.println("Please select a option:");
        System.out.println("to get the amount of borrowers enter   1");
        System.out.println("to remove a borrower enter             2");
        System.out.println("to show all borrowers  enter           3");
        System.out.println("to show one specific borrowers         4");
        System.out.println("to add a new borrower                  5");
        System.out.println("to exit program                        0");
    }
    
    /**
     * this method will look at the number the 
     * user has entered and do that command
     * 
     * return command
     */
    public int getCommand()
    {
        System.out.println("Enter command:");
        int command=myScanner.nextInt();//This will scan the number and call it command
        myScanner.nextLine();//then will look on the next line to make sure that it has not happpened
        return command;// it will return the command which is detailed in the execute method
    }
    
    /**
     * this will look at the number and do the action which corresponds 
     * with the number entered.
     * 
     * @param command
     * 
     */
    public void execute(int command)
    {
        //if number is one do method getNumberofBorrowers()
        if (command==1)
            getNumberofBorrowers();
        //if number entered is 2 do the moethod removeborrower()
        else if (command==2)
            removeBorrower();
        //if number enter is 3 do the method show all borrowers
        else if (command==3)
            showAllBorrowers();
        // if number enter is 4 do the method showBorrower();
        else if (command==4)
           showBorrower();
        //if the number entered is 5 then add a borrower
        else if (command==5)
           addBorrower();
        //if the number is zero you should exit the program
        else if (command==0)
            quitCommand();
        //if it wass any other number call the unknowncommand method
        else
            unknownCommand(command);
        
    }
    
    /**
     * this method will exit the user interface if the number press was zero
     */
    public void quitCommand()
    {
        System.out.print("program is closing down");
        //system is exit safely
        System.exit(0);
    }
    
    /**
     * this should make a brand new borrower by entering new values
     * for first name, surname, library number,street,town and postcode
     * and then callingadd borrower method 
     */
    public void addBorrower()
    {  
        System.out.print("Enter first name : ");
        String fName = myScanner.nextLine();
        System.out.print("Enter last name: ");
        String lName = myScanner.nextLine();
        System.out.print("Enter Library Number:");
        String lNumber= myScanner.nextLine();
        System.out.print("Enter street:");
        String Street=myScanner.nextLine();
        System.out.print("Enter town:");
        String Town=myScanner.nextLine();
        System.out.print("enter postcode:");
        String Postcode=myScanner.nextLine();
        //when finished do the addborrower method in borrowlist with new values used
        borrowerList.addBorrower(new Borrower (fName,lName,lNumber,Street,Town,Postcode));
    }
    
    /**
     * this method should print we have a [specific amount] borrowers
     */
    public void getNumberofBorrowers()
    {
        System.out.println("we have a"+ borrowerList.getNumberOfBorrowers()+" Borrowers");
    }
    
    /**
     * this method should remove when they have been given a library number 
     * if it exists say borrower remove and then remove it
     * however it is doesn't say it has not been removed
     */
    public void removeBorrower()
    {
        System.out.print("enter library Number: ");
        String libraryNumber=myScanner.nextLine();//SCAN LINE TO SEE WHAT THE LIBRARY NUMBER IS
      /**
       * call remove borrower and if true print it 
       * has been removed but can't be fouind say it is not removed
       */
      if(borrowerList.removeBorrower(libraryNumber))
      {
          System.out.println("borrower with library Number "+libraryNumber+" removed");
      }
      else
      {
          System.out.println("Borrower with library Number "+libraryNumber+" NOT removed");
      }
       
    }
    
    /**
     * it should show all the borrowers in the list
     */
    public void showAllBorrowers()
    {
        borrowerList.getAllBorrowers();//call the get all borrowers class in borrowerlist
    }
    
    /**
     * this method show a specific borrower when given a library number 
     * but show could not find borrower if you can't find it
     */
    public void showBorrower()
    {
        System.out.print("enter library Number: ");
        String libraryNumber=myScanner.nextLine();// scan line to see what the library Number
        /**
         * call get borrower(libraryNumber} if it is false 
         * it should output could not find borrower
         */
      if(borrowerList.getBorrower(libraryNumber)==false)
      {
          System.out.println("could not find borrower");
      }
    }

    /**
     * if it is unknown, state that it is not a command
     */
    public void unknownCommand(int command)
    {
        System.out.println("not a command: "+ command);
    }









}
