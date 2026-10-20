package arraymarks;
import java.util.Scanner;
public class ArrayMarks 
{

    public static void main(String[] args) 
    {
            // Fixed Size Array
        int[] marks1 = new int[3];
        
        marks1[0] = 58;  // Eng
        marks1[1] = 78;  // Urd
        marks1[2] = 80;  // Math
        
        System.out.println(" === Marks 01 ===");
        
        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[2]);
        
        // Direct Initialization  
        int [] marks2 = {12, 78, 89};
                
        System.out.println(" === Marks 02 ===");
        
        // Displaying Using loop 
        for(int i = 0; i < 3; i++)
        {
            System.out.println(marks2[i]);
        }
         System.out.println(" === == === \n");
          
            // User-defined size            
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] marks3 = new int[size];
        System.out.println(" === Marks 03 ===");
        
            // For Input
        for(int i = 0; i < size; i++)
        {
            marks3[i] = input.nextInt();
        }
        
            // For output 
        for(int i = 0; i < size; i++)
        {
            System.out.println(marks3[i]);
        }
    }
    
}
