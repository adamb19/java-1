
/**
 * Write a description of class Week9Exercises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Week9Exercises
{
//    private int[]array1;
 //   private int[] array2;
    private Scanner scan;
    public Week9Exercises()
    {
        scan=new Scanner(System.in);
//        keyboard = new Scanner(System.in);  
    }
    public void ex1()
    {
        int[]array1={9,15,-23,4,10};
        for(int count=0;count<5;count++)
            System.out.println("number is"+array1[count]);
    }
    public void ex2()
    {
        int[]array2=new int[5];
        
        for(int index=0;index<array2.length;index++)
        {
            System.out.println("enter an integer:");
            
            array2[index]=scan.nextInt();
           
        }
        for(int index=0;index<array2.length;index++)
        {
          System.out.println(array2[index] + "\t\t" + index);
        }
        for(int index=0;index<array2.length;index++)
        {
          System.out.println(index + "\t\t" + array2[index]);
        }
    }
    public void ex3()
    {
        String[]array3=new String[4];
        for(int index=0;index<array3.length;index++)
        {
            System.out.println("enter a string:");
            array3[index]=scan.next();
        }
            for(int index=0;index<array3.length;index++)
        {
          System.out.println(array3[index] + "\t\t" + index);
        }
        for(int index=0;index<array3.length;index++)
        {
          System.out.print(array3[index] + "," );
        }
    }
        
        
    








}
