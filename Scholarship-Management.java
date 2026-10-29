package scolership;

public class Student 
{
    private String name;
    private double semFees;
    public static double scholarshipRate = 20.0;
    
public Student (String n, double sc)
{
   this.name=n;
   this.semFees = sc;
   
}
public void calculateScholarship()
    {
        double scholarshipAmount = (semFees * scholarshipRate) / 100;

        System.out.println("Student Name: " + name);
        System.out.println("Semester Fees: " + semFees);
        System.out.println("Scholarship Rate: "
                + scholarshipRate + "%");
        System.out.println("Scholarship Amount: "
                + scholarshipAmount);
        System.out.println("\n--------------------------\n");
    }

}
    // Main
package scolership;

public class Scolership
{

    public static void main(String[] args) 
    {
        Student s1 = new Student("Ali", 50000);
        Student s2 = new Student("Ahmed", 60000);
        Student s3 = new Student("Usman", 40000);

        System.out.println(" == Scholarship at 20% Rate ==\n");
        s1.calculateScholarship();
        s2.calculateScholarship();
        s3.calculateScholarship();

        Student.scholarshipRate = 30.0;

        // Display updated scholarship at 30%
        System.out.println("== Scholarship at 30% Rate ==\n");
        s1.calculateScholarship();
        s2.calculateScholarship();
        s3.calculateScholarship();
    }
    
}
