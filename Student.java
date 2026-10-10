public class Student
{
    String name;
    String RegNo;
    int age;

    void displayInfo() 
    {
        System.out.println("Name  : " + name);
        System.out.println("RegNo : " + RegNo);
        System.out.println("Age   : " + age);
    }

    void Study() 
    {
        System.out.println(name + " is Studying Java OOP");
    }

          // Main Method

    public static void main(String[] args) 
   {

        Student s = new Student();

        s.name = "Muddasar Khan";
        s.RegNo = "SP26-BCS-049";
        s.age = 19;  

        s.displayInfo();
        s.Study();
    }
}
