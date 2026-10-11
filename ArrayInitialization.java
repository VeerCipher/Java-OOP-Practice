package array.initialization;
public class ArrayInitialization
{
    public static void main(String[] args) 
    {
        // Array Initialization At The Time Of Declaration
        
        int [] arr = {13, 34, 45, 54};
        for(int i = 0; i < arr.length; i++)
        {
            System.out.printf("%d\n",arr[i] );
        }
        System.out.printf("ArrayLength : %d\n", arr.length);
    }
    
}
