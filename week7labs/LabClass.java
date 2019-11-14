
/**
 * Write a description of class LabClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class LabClass
{
    private String instructor;
    private String room;
    private ArrayList<Student> students;
    private String timeAndDay;
    
    public LabClass()
    {
        instructor="unknown";
        room="unknown";
        timeAndDay="unknown";
        students= new ArrayList <Student> ();
    }
    public void enrollStudent(Student newStudent)
    {
        students.add(newStudent);
    }
    public void setInstructor (String instructorName)
    {
        this.instructor= instructorName;
    }
    public void setRoom (String roomNumber)
    {
        this.room=roomNumber;
    }
    public void setTime(String timeAndDayString)
    {
        this.timeAndDay= timeAndDayString;
    }
    public String getTime()
    {
        return timeAndDay;
    }
    public String getRoom()
    {
        return room;
    }
    public String getInstructor()
    {
        return instructor;
    }
    public int numberOfStudents()
    {
        return students.size();
    }
    public void printlist()
    {
        System.out.println("Lab class"+ timeAndDay);
        System.out.println("Instructor:"+instructor+"room:"+room);
        System.out.println("class list:");
        for(Student student:students)
        {
            student.print();
        }
        System.out.println("Number of student:"+numberOfStudents());
    }
    public void removeStudent(Student aStudent)
    {       
        students.remove(aStudent);       
    }
    public void removeStudent(int studentEntry)
    {
        if(studentEntry < 0)
        { 
            System.out.println("Negative entry :" + studentEntry);
        }
        else if(studentEntry < numberOfStudents())
        {
            students.remove(studentEntry);
        }
        else
       {
            System.out.println("No such entry :" + studentEntry);
        }
    }


    
        
     
    








}
