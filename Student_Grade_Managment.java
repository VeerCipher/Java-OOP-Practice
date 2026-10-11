package student.grade.managment.system;
import java.util.Scanner;

public class Student 
{
    private String name;
    private int rollNumber;
    private double marks;
    
    // Constructors
    
    public Student()
    {
        this("Unknown",0, 0.0);
    }
    
    public Student(String name, int roll)
    {
        this(name, roll, 0.0);
    }
    
    public Student(String name, int roll, double mark)
    {
        setName(name);
        setroll(roll);
        setmark(mark);
    }
    
    // Setters And Getter
    
    public void setName(String n)
    {
        if(n != null && !n.isEmpty())
        {
            this.name = n;
        }
        else
        {
            this.name = "Unknown";
        }
    }
    public String getName()
    {
        return name;
    }
    
    public void setroll(int r)
    {
        if(r > 0)
        {
            this.rollNumber = r;
        }
        else
        {
            this.rollNumber = 0;
        }
        
    }
    public int getroll()
    {
        return rollNumber;
    }
    
    public void setmark(double m)
    {
        if(m >= 0.0 && m <= 100.0)
        {
            this.marks = m;
        }
        else
        {
            this.marks = 0.0;
            System.out.println("Error : Marks must be between 0-100 !");
        }
    }
    public double getmark()
    {
        return marks;
    }
    
        // Display Detail
    
    public void displayInfo()
    {
        System.out.printf("Name      :    %s  \n", this.name);
        System.out.printf("Roll No   :    %d  \n", this.rollNumber);
        System.out.printf("Marks     :    %.2f\n", this.marks);
        System.out.printf("Grade     :    %c  \n", this.calculateGrade());
    }
    
    // Grade Calculation
    
    public char calculateGrade()
    {
        if(this.getmark() > 85)
        {
            return 'A';
        }
        else
        if(this.getmark() > 70)
        {
            return 'B';                   
        }
        else
        if(this.getmark() > 50)
        {
            return 'C';
        }
        else
        {
            return 'F';
        }
        
    }
    
    // User Input
    
    public void input()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Name      :    ");
        this.setName(input.nextLine());

        System.out.print("Roll N0   :    ");
        this.setroll(input.nextInt());

        System.out.print("Marks     :    ");
        this.setmark(input.nextDouble());
        
        System.out.println(" --- User Information ---");
    }   
}

        //  Main

package student.grade.managment.system;

public class StudentGradeManagmentSystem 
{

    public static void main(String[] args) 
    {
        // No Argument Constructor
        
        System.out.println("\n===== No-Argument Constructor ===== \n");
        Student s1 = new Student();
        s1.displayInfo();
        
        // Two Parameter Constructor
        
        System.out.println("\n===== Two-Parameter Constructor ===== \n");
        Student s2 = new Student("Khan", 21);
        s2.displayInfo();
        
        // Three Parameter Constructor
        
        System.out.println("\n===== Three-Parameter Constructor =====\n");
        Student s3 = new Student("Jalali", 49, 91.0);
        s3.displayInfo();
        
        // Testing Invalid Values
        
        System.out.println("\n===== Validation Test =====\n");
        Student s4 = new Student();
        s4.setName("");
        s4.setmark(102);
        s4.displayInfo();
        
        // Taking Input From User
        
        System.out.println("\n===== User Input =====\n");
        Student s5 = new Student();
        s5.input();
        s5.displayInfo();
        
    }
}
