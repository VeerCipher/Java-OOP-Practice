class Student
{
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void setMarks(double marks)
    {
        if (marks >= 0 && marks <= 100)
        {
            this.marks = marks;
        }
        else
        {
            System.out.println("Invalid Marks!");
        }
    }

    public String getName()
    {
        return name;
    }

    public int getRollNumber()
    {
        return rollNumber;
    }

    public double getMarks()
    {
        return marks;
    }

    @Override
    public String toString()
    {
        return "Student Name : " + name +
               "\nRoll Number  : " + rollNumber +
               "\nMarks        : " + marks;
    }
}
    // Main

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Ali", 101, 85.5);
        Student s2 = new Student("Ahmed", 102, 90.0);
        Student s3 = new Student("Usman", 103, 78.5);

        System.out.println("\n ===== STUDENT RECORDS ===== \n");

        System.out.println(s1);
        System.out.println("\n" + s2);
        System.out.println("\n" + s3);
    }
}
