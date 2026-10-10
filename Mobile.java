public class Mobile 
{
    private String brand;
    private int model;
    private int ram;
    private double price;
    private int storage;

         // Parameterized Constructor

    public Mobile(String b, int m, int r, int s, double p) 
    {
        brand = b;
        model = m;
        ram = r;
        storage = s;
        price = p;
    }

         // No-argument Constructor

    public Mobile() 
    {

    }

        // Setters

    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public void setModel(int model) 
    {
        this.model = model;
    }

    public void setRam(int ram) 
    {
        this.ram = ram;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void setStorage(int storage) 
    {
        this.storage = storage;
    }

         // Getters

    public String getBrand()
    {
        return brand;
    }

    public int getModel() 
    {
        return model;
    }

    public int getRam() 
    {
        return ram;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getStorage() 
    {
        return storage;
    }

        // Display Information

    public void displayInfo() 
    {
        System.out.println("\n--- Mobile Info ---");

        System.out.println("Brand   : " + getBrand());
        System.out.println("Model   : " + getModel());
        System.out.println("RAM     : " + getRam() + " GB");
        System.out.println("Storage : " + getStorage() + " GB");
        System.out.println("Price   : Rs. " + getPrice());
    }

                        // Main Method

    public static void main(String[] args) 
   {

        // Object 1: Parameterized Constructor

        Mobile m1 = new Mobile("iPhone", 16, 16, 512, 230000);

        // Object 2: No-argument Constructor

        Mobile m2 = new Mobile();

        // Set values using setters

        m2.setBrand("Samsung");
        m2.setModel(24);
        m2.setRam(32);
        m2.setStorage(512);
        m2.setPrice(220000);

        // Display both objects

        m1.displayInfo();
        m2.displayInfo();
    }
}
