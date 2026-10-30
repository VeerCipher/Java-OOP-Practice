package obj.ref;

public class Student 
{
    private String name;
    private int age;
    
    public Student(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    
    public void display(Student ref)
    {
        System.out.printf("Name  :  %s\n", ref.name);
        System.out.printf("Age   :  %d\n", ref.age);
    }
    
}
  // Main

package obj.ref;

public class ObjRef 
{

    public static void main(String[] args) 
    {
        Student s1 = new Student("Jalali", 19);
        Student s2 = new Student("Khan", 20);
        
        System.out.printf("\n == Student s1 == \n\n");
        s1.display(s1);
        
        System.out.printf("\n == Student s2 == \n\n");
        s2.display(s2);
    }
    
}
