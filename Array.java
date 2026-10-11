package array;

public class Array 
{

    public static void main(String[] args)
    {
        int [] arr = new int[5]; 
        // Printing Array Elements
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.printf("%d\n", arr[i]);
        }
        // Array Length
        
        System.out.printf("Array Length  :  %d\n", arr.length);
        
    }
    
}
