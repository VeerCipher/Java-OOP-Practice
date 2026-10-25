package remove;
import java.util.ArrayList;
public class Remove
{
    public static void main(String[] args)
    {
        ArrayList <String> Students = new ArrayList <> ();
        
            // Adding Elements
            
        Students.add("Jalali");
        Students.add("Junaid");
        Students.add("Ahsan");
        Students.add("Ali");
        Students.add("Hamza"); 
        
        System.out.println("\n == Before Removing == \n");
        System.out.printf("Size Of An ArrayList  :  %d\n", Students.size());
        
            // Removing Elements By Value
            
        Students.remove("Ali");
    
            // Removing Elements By Index
            
        Students.remove(1);
        
            // Size 
        System.out.println("\n == After Removing == \n");
        System.out.printf("Size Of An ArrayList  :  %d\n", Students.size());
    }
    
}
