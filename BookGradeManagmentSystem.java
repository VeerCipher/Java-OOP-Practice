package gradebook;
import java.util.Scanner;

public class Book 
{
    private String courseTitle;
    private String courseCode;
    private double[] courseMarks;
    
    public Book()
    {
        
    }
    
        // Using Stter 
    
    public void setcouTitle(String ct)
    {
        if (!(ct == null && ct.length() == 0))
        {
            this.courseTitle = ct;
        }
        else
        {
            System.out.println("Invalid Course Title");
            this.courseTitle = "PF";
        }
    }
    
    public void setcouCode(String cc)
    {
        if (!(cc == null && cc.length() == 0))
        {
            this.courseCode = cc;
        }
        else
        {
            System.out.println("Invalid Course Title");
            this.courseCode = "C123";
        }
    }
    
    public void setcouMarks(double [] cm)
    {
        if(cm == null)
        {
            System.out.println("Invalid Marks");
            this.courseMarks = new double[5];
        }
        else
        {
            for(int i = 0; i < cm.length; i++)
            {
                if(cm [i] >= 0 && cm[i] <= 100)
                {
                    this.courseMarks = cm;
                }
                else
                {
                    System.out.println("Invalid Marks");
                    cm[i] = 0;
                }
            }
            this.courseMarks = cm;
        }
    }
    
    public Book(String ct, String cc, double[] m)         
    {
        this.courseTitle = ct;
        this.courseCode = cc;
        this.courseMarks = m;
    }
    
        // Maximum Marks 
    public void MaxGrade()
    {
        // let [0] = maximum
        double max = this.courseMarks[0];
        for(int i = 0; i < this.courseMarks.length; i++)
        {
            if(max < this.courseMarks[i])
            {
                max = this.courseMarks[i];
            }
        }
        System.out.printf("Maximum Marks  :  %.2f \n", max);
    }
    
        // Minimum Marks
    
    public void minGrade()
    {
        // let [0] = minimum
        double min = this.courseMarks[0];
        
        for(int i = 0; i < this.courseMarks.length; i++)
        {
            if(min > this.courseMarks[i])
            {
                min = this.courseMarks[i];
            }
        }
        System.out.printf("Minimum Marks  :  %.2f\n", min);
    }
    
        // Average 
    
    public void Average()
    {
        double avg = 0.0;
        
        for(int i = 0; i < this.courseMarks.length; i++)
        {
            avg = avg + this.courseMarks[i];
        }
        System.out.printf("Average Marks  :  %.2f\n", avg/ this.courseMarks.length);
    }
    
          // User Input
    
    public void inputRecord()
    {
        System.out.println("\n === User Input Record \n");
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter Student Count  :   ");
        int tstudent = input.nextInt();
        this.courseMarks = new double [tstudent];
        
        input.nextLine();
        System.out.printf("Course Title  :   ");
        this.courseTitle = input.nextLine();
        
        System.out.printf("Course Code  :   ");
        this.courseCode = input.nextLine();
        
        // Initializing Array (Marks)
        
        for (int i = 0; i <this.courseMarks.length; i++)
        {
            System.out.printf("");
        }
    }
    
          // Process
    public void processGrade()
    {
        System.out.printf("\n Welcome to Grade Book Of %S(%S)\n\n", this.courseTitle, this.courseCode);
        this.printRecord();
        this.MaxGrade();
        this.minGrade();
        this.Average();
    }
    
        // Display All
    public void printRecord()
    {
        System.out.printf("%-15S %-15S\n", "Reg No", "Marks");
        System.out.println("---------------------");
        // As we don't have any reg no of student, so in this case we let the index no as a reg no
        
        for(int i = 0; i < this.courseMarks.length; i++)
        {
            System.out.printf("%-15d  %-15.2f\n", i, this.courseMarks[i]);         
        }
        System.out.println("---------------------");
        
        // Now finding total Student Record
        System.out.printf("Total Student Record  :  %d\n", this.courseMarks.length);   
    }
}
    
        // Main

package gradebook;

public class GradeBook 
{

    public static void main(String[] args) 
    {
        // Creating object
        
        String ctitle = "Oop";
        String ccode = "CSC103"; 
        double [] sm = {50, 60, 70, 80, 90};
        
        // Passing refrences of  these objects     
        Book Oop = new Book(ctitle, ccode, sm);
        
        Oop.processGrade(); 
        
            // Using Setters and getters
        
        double [] sm1 = {55, 66, 45, 89, 90};
        
        // Creating Object
        Book PF = new Book();
        PF.setcouTitle("PF");
        PF.setcouCode("CSC102");
        PF.setcouMarks(sm1);
        
        PF.processGrade();
        
        // Using User Input
    
        Book DS = new Book();
        DS.inputRecord();
        DS.processGrade();
    }   
        
}
