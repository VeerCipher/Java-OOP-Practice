public class Employee 
{
    private String name;
    private int id;
    private double salary;

    // Parameterized Constructor
    public Employee(String n, int id, double s)
    {
        this.name = n;
        this.id = id;
        this.salary = s;
    }

    // Copy Constructor
    public Employee(Employee E)
    {
        this.name = E.name;
        this.id = E.id;
        this.salary = E.salary;
    }

    // Display Information
    public void displayInfo()
    {
        System.out.printf("Name    :  %s%n", this.name);
        System.out.printf("Id      :  %d%n", this.id);
        System.out.printf("Salary  :  %.2f%n", this.salary);
    }

    // Main Method
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Jalali", 49, 5600.9);

        System.out.println("=== Original Employee ===\n");
        e1.displayInfo();

        Employee e2 = new Employee(e1);  // Now Gain the properties of e1

        System.out.println("\n=== Copied Employee ===\n");
        e2.displayInfo();
    }
}
