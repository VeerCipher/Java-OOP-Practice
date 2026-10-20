package pkg2darray;
import java.util.Scanner;
public class Main 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter Rows  :  ");
        int rows = sc.nextInt();
        
        System.out.printf("Enter Cols  :  ");
        int cols = sc.nextInt();
        
        int [][] number = new int[rows][cols];
        
            // Input
        for(int i=0; i<rows; i++)   // rows
        {
            for(int j=0; j<cols; j++)   // cols
            {
                number [i][j] = sc.nextInt();
            }
        }
            // Output
        System.out.println(" ==== 2D Array === ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
