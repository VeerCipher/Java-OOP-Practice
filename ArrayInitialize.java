package array.initialize;
import java.util.Scanner;

public class ArrayInitialize 
{

    public static void main(String[] args) 
      {

        // Array Initialization From User

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        // Taking input from the user
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.printf("Enter value number %d: ", i + 1);
            arr[i] = input.nextInt();
        }

        // Displaying array elements
        
        System.out.println("\nArray Elements:");

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.printf("%d ", arr[i]);
        }

        // Displaying array length
        
        System.out.printf("Array Length: %d \n", arr.length);
    }
}
