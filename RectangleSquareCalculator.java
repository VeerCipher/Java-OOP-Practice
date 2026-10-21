package rectangle.square.calculator;

public class RectangleSquareCalculator 
{

    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle();
        
        r1.calarea();
        r1.calperimeter();
        r1.issquare();
        r1.displayInfo();
        
        Rectangle r2 = new Rectangle(5.0);
        
        r2.calperimeter();
        r2.calarea();
        r2.issquare();
        r2.displayInfo();
        
        Rectangle r3 = new Rectangle(4.0, 7.0);
        
        r3.calperimeter();
        r3.calarea();
        r3.issquare();
        r3.displayInfo();
        
        //  For Test
        
        Rectangle r4 = new Rectangle ();
        
        r4.setlength(0.4);
        r4.setbreath(-9);
        
        r4.calarea();
        r4.calperimeter();
        r4.displayInfo();
        
        // Input
        Rectangle r5 = new Rectangle ();
        r5.inpute();
        
        System.out.println(" == OutPut ==");
        
        r5.calarea();
        r5.calperimeter();
        r5.displayInfo();
    }
    
}

      // Main

package rectangle.square.calculator;
import java.util.Scanner;

public class Rectangle
{
    private double length;
    private double breath;
    
        // Setters & Getters
    
    public void setlength(double l)
    {
        if (l > 0.0)
        {
            this.length = l;
        }
        else
        {
            this.length = 1.0;
            System.out.println("Invalid Length !");
        }
    }
    public double getLength()
    {
        return this.length;
    }
    
    public void setbreath(double b)
    {
        if(b > 0.0)
        {
            this.breath = b;
        }
        else
        {
            this.breath = 1.0;
            System.out.println("Invalid breath !");
        }
    }
    public double getbreath()
    {
        return this.breath;
    }
        // Constructores
    
    public Rectangle()
    {
        this(1.0, 1.0);
    }
    
    public Rectangle(double side)
    {
        this(side, side);
    }
    
    public Rectangle(double l, double b)
    {
        this.setlength(l);
        this.setbreath(b);
    }
    
        // Area
    public double calarea()
    {
        return this.length * this.breath;
    }
    
    public double calperimeter()
    {
        return 2 * (this.length + this.breath);
    }
    
    public boolean issquare()
    {
        return this.length == this.breath;
    }
    
        // Display Info
    
    public void displayInfo()
    {
        System.out.printf("Length     :  %.2f\n", this.getLength());
        System.out.printf("Breath     :  %.2f\n", this.getbreath());
        System.out.printf("Area       :  %.2f\n", this.calarea());
        System.out.printf("Perimeter  :  %.2f\n", this.calperimeter());
        System.out.printf("is Square  :  %b\n", this.issquare());
        System.out.println("\n ==================== ");
    }
    
        // Input
    
    public void inpute()
    {
        Scanner input = new Scanner (System.in);
        
        System.out.printf("Length   :  ");
        double l = input.nextDouble();
        
        System.out.printf("Breath   :  ");
        double b = input.nextDouble();
        
        this.setlength(l);
        this.setbreath(b);
    }
}
