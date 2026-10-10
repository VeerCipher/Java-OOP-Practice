public class Book 
{
    private String title;

    // Setter
    public void setTitle(String t) 
    {
        this.title = t;
    }

    // Getter
    public String getTitle() 
    {
        return title;
    }

           // Main

    public static void main(String[] args) 
    {
        Book b = new Book();

        b.setTitle("Java OOP");

        System.out.println(b.getTitle());
    }
}
