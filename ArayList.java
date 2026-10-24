package arraylist;
import java.util.ArrayList;

public class Arraylist
{

    public static void main(String[] args) 
    {
        ArrayList <Integer> list = new ArrayList <>();
        
        // Ading Elements
        
    System.out.println("== Adding Elements ==\n");
    list.add(1);
    list.add(2);
    list.add(3);
    
    System.out.println(list);
        
        // Getting Elements
        
    System.out.println("\n== Getting Elements ==\n");
    int a = list.get(0);   // FOr getting elements we pass its index and store it in a variable
    System.out.println(a);
    
    int b = list.get(1);
    System.out.println(b);
    
    int c = list.get(2);
    System.out.println(c);
    
        // Adding Elements In Between
        
    System.out.println("\n== ADDUNG Elements In Between ==\n");
    list.add(0, 3);   // 0 = Index No & 3 = passing it in this index
    System.out.println(list);
    
        // Set Element / Changing the Existing Elements
    
    System.out.println("\n== Set Element ==\n");
    list.add(1, 4);
    System.out.println(list);
    
        // Deleting Elements
        
    System.out.println("\n== Deleting Elements==\n");
    list.remove(2);
    System.out.println(list);
    
        // Finding Size
    System.out.println("\n== Size Of Arraylist ==\n");
    list.size();
    System.out.println(list);
    
    }
    
}
