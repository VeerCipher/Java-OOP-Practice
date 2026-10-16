public class Book 
{
    private String bookTitle;
    private double bookPrice;
    private int bookPages;
    private boolean bookStatus;
    
    public void printBookInfo()
    {
        System.out.println("\n   === Book Info === \n");
        
        System.out.printf("Title   :   %s\n",   this.bookTitle);
        System.out.printf("Price   :   %.2f\n", this.bookPrice);
        System.out.printf("Pages   :   %d\n",   this.bookPages);
        System.out.printf("Status  :   %b\n",   this.bookStatus);
    }

    // Main

    public static void main(String[] args)
    {
       Book b = new Book();
       
       b.printBookInfo();  // for this default constructor initialize it default values
    }
