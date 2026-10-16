public class Book 
{
    private String bookTitle;
    private double bookPrice;
    private int bookPages;
    private boolean bookStatus;
    
    // Constructor with 0-Parameter 
    
    public Book()
    {
        this.bookTitle = "Unknown";
        this.bookPrice = 380;
        this.bookPages = 200;
        this.bookStatus = false;
    }
    
    // Parametrized Constructor
    
    public Book(String bt, double bp, int bpg, boolean bs)
    {
        this.bookTitle = bt;
        this.bookPrice = bp;
        this.bookPages = bpg;
        this.bookStatus = bs;
    }
    
    public void printBookInfo()
    {        
        System.out.printf("Title   :   %s\n",   this.bookTitle);
        System.out.printf("Price   :   %.2f\n", this.bookPrice);
        System.out.printf("Pages   :   %d\n",   this.bookPages);
        System.out.printf("Status  :   %b\n",   this.bookStatus);
    }
}

    //  Main

    public static void main(String[] args) 
    {
       Book b1 = new Book(); 
       System.out.println("\n   === Book b1 Info === \n");      
       b1.printBookInfo();  
       
       Book b2 = new Book("Java OOP", 1570, 132, true);
       System.out.println("\n   === Book b2 Info === \n");
       b2.printBookInfo();
             
    }
