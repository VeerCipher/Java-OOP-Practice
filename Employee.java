public class employee 
{
    private String empName;
    private int empage;
    private double empSalary;
    
            // Employee Name
    
    public void setEmpName(String en)
    {
        // for checking validity of an object
        
        if (en == null || en.length() == 0)
        {
            System.out.println("Invalid Name");
            this.empName = "Unknown";
        }
        else
        {
            this.empName = en;
        }
    }
    public String getEmpName()
    {
        return this.empName;
    }
    
            // Employee Age
    
    public void setEmpAge(int a)
    {
        if (a >= 18)
        {
            this.empage = a;
        }
        else
        {
            System.out.println("Invalid Age");
            this.empage = 18;
        }
    }
    public int getEmpAge()
    {
        return this.empage;
    }
    
            // Employee Salary
    
    public void setEmpSalary(double s)
    {
        // let Every employee has minimum 20000 salary
        
        if (s >= 20000)
        {
            this.empSalary = s;
        }
        else
        {
            System.out.println("Invalid Salary");
            this.empSalary = 20000;
        }
    }
    public double getEmpSalary()
    {
        return this.empSalary;
    }
}

    // Main

public static void main(String[] args) 
    {
        employee obj = new employee();
        obj.setEmpName("Jalali");
        obj.setEmpAge(27);
        obj.setEmpSalary(21000);
        
        System.out.println("  === Employee Record === \n");
        System.out.printf("Name     :   %s\n",obj.getEmpName());
        System.out.printf("Age      :   %d\n", obj.getEmpAge());
        System.out.printf("Salary   :   %.2f\n",obj.getEmpSalary());
       
    }
    
}

