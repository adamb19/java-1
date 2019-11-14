
/**
 * Write a description of class week5exercises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class week5exercises
{
    private Scanner myScanner;
    public week5exercises()
    {
        myScanner=new Scanner(System.in);
    }
    public void ex1()
    {
        System.out.println("enter the mark" );
        int grade=myScanner.nextInt();
        if(grade>100)
        {
            System.out.println("mark entered was over 100");
        }
        if(grade>=70)
        {
            if(grade<=100)
            {
              System.out.println("first");
            }
        }
        if (60<=grade)
        {
            if(grade<=69)
            {
              System.out.println("upper second");
            }
        }
        if (50<=grade)
        {
            if (grade<=59)
            {
               System.out.println("lower Second");
            }
        }
        if(40<=grade)
        {
            if(grade<=49)
            {
              System.out.println("third");
            }
        
        }
        if(grade<40)
        {
            System.out.println("fail");
        }
        if(grade<0)
        {
            System.out.println("mark enter is negative");
        }
    }
    public void ex2()
    {
        System.out.println("enter the grade intial" );
        String grade2=myScanner.nextLine();
        if(grade2.equals(d))
        {
            System.out.println("Distinction");
        }
        if(grade2="m")
        {
            System.out.println("Merit");
        }
        if(grade2="p")
        {
            System.out.println("Pass");
        }
        if(grade2="f")
        {
            System.out.println("Fail");
        }
        if(grade2="a")
        {
            System.out.println("absent from assessment");
        }
        else
        {
            System.out.println(" illegal value enter:"+ grade2);
        }
    }
            
            
       
        
        
    








    }
