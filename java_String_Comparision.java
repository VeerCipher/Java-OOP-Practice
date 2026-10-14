public class Sting 
{

    public static void main(String[] args) 
    {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String ("Hello");
        
        System.out.println("\n === Comperision on the basis of Object/Reference  === \n");
        
        System.out.println(str1 == str2); // it gives true b/c both references pointing to same object this is b/c of string constant pooling 
        System.out.println(str1 == str3); // it gives false b/c both references pointing to differnt object
        
        System.out.println("\n === comperision on the basis of content  === \n");
        
        System.out.println(str1.equals(str3) );
        System.out.println(str1.equals(str2) );
        
    }
    
}
