package employee.pyroll.system;

public class EmployeePyrollSystem 
{
   public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        e1.displayInfo();
        
        Employee e2 = new Employee("Jalali", 102, 11000.0);
        e2.displayInfo();
        
        Employee e3 = new Employee("Khan", 104, 31000.0, "Worker");
        e3.displayInfo();
        
            // Test negative salary
        Employee e = new Employee("Ali",105, -5000.0);
        e.displayInfo();
        
        Employee e4 = new Employee();
        e4.input();
        e4.displayInfo();
    }
    
}
    // Main

package employee.pyroll.system;
import java.util.Scanner;

public class Employee 
{
    private String empName;
    private int empId;
    private double Salary;
    private String destination;
    
            // Setters
    
    public void setempname(String n)
    {
        if(n != null && n.length() != 0)
        {
            this.empName = n;
        }
        else
        {
            this.empName = "Unknown";
        }
    }
    public String getempname()
    {
        return this.empName;
    }
    
    public void setempId(int id)
    {
        if (id > 0)
        {
            this.empId = id;
        }
        else
        {
            this.empId = 0;
            System.out.println("Invalid Employee Id");
        }
    }
    public int getempId()
    {
        return this.empId;
    }
    
    public void setsalary(double s)
    {
        if(s >= 10000.0)
        {
            this.Salary = s;
        }
        else
        {
            this.Salary = 10000.0;
        }
    }
    public double getsalary()
    {
        return this.Salary;
    }
    
    public void setdest(String d)
    {
        if(d != null && d.length() != 0)
        {
            this.destination = d;
        }
        else
        {
            this.destination = "Unknown";
        }       
    }
    public String getdest()
    {
        return this.destination;
    }
    
            // Constructors
    
    public Employee()
    {
        this("Unknown", 100, 10000.0, "Trainee");
    }
    
    public Employee(String en, int id, double sal)
    {
        this(en, id, sal, "Traiee");
    }
    
    public Employee(String en, int id, double sal, String des)
    {
        this.setempname(en);
        this.setempId(id);
        this.setsalary(sal);
        this.setdest(des);
    }
    
    public double calNetSalary()
    {
        double hra = Salary * 0.2;
        double da = Salary * 0.1;
        
        return Salary + hra + da;
    }
    
    public void input()
    {
        Scanner input = new Scanner (System.in);
        
        System.out.printf("Name    :  ");
        String n = input.nextLine();
        
        System.out.printf("ID      :  ");
        int id = input.nextInt();
        
        System.out.printf("Salary  :  ");
        double s = input.nextDouble();
        input.nextLine();
        
        System.out.printf("Destina :  ");
        String d = input.nextLine();
        
        this.setempname(n);
        this.setempId(id);
        this.setsalary(s);
        this.setdest(d);
    }
    
            // Display All Info
    
    public void displayInfo()
    {
        double hra =Salary * 0.20;
        double da = Salary * 0.10;

        System.out.printf("Name    :  %s\n", this.getempname());
        System.out.printf("ID      :  %d\n", this.getempId());
        System.out.printf("Salary  :  %.2f\n", this.getsalary());
        System.out.printf("Destin  :  %s\n", this.getdest());
        
        System.out.printf("HRA     :  %.2f\n", hra);
        System.out.printf("DA      :  %.2f\n",  da);
        
        System.out.printf("\nNet Salary  :  %.2f\n", this.calNetSalary());
        
        System.out.println("\n ============== ");
    }
    
}
