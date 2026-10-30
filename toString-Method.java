package tostring;

public class TestToString 
{
    private String name;
    private int age;

    public TestToString(String n, int a)
    {
        this.name = n;
        this.age = a;

    }
            
    @Override
    public String toString()
    {
        return "Name  :  "+name + "\nAge   :  " +age;
    }
                  
}
  // Main
package tostring;

public class ToString 
{
    public static void main(String[] args) 
    {
        TestToString t = new TestToString("Jalali", 20);
        
        System.out.println(t);
    }
}
