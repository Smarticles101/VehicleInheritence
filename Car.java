
/*
 *Jack Costigan 
 *
 *Program Demonstrates OOP inheritance
 * 
 */
public class Car extends MotorizedVehicle
{
    boolean turbos;
    int numDoors;
    
    public Car ()
    {
        super();
        turbos = true;
        numDoors= 0;
    }
    public Car(String brand)
    {
        super(brand);
        numDoors = 0;
        turbos = true;
    }
    public Car(String brand, String color)
    {
        super(brand, color);
        numDoors = 0;
        turbos = true;
    }
    public Car(String brand, String color, double power)
    {
        super(brand, color, power);
        numDoors = 0;
        turbos = true;
    }
    public Car(String brand, String color, double power, int  doors)
    {
       super(brand, color, power);
       numDoors = doors;
       turbos = true;
    }    
    public Car(String brand, String color, double power, int  doors, boolean turbo)
    {
       super(brand, color, power);
       numDoors = doors;
       turbos = turbo;
    }    
    public boolean getTurbos()
    {
      return turbos;
    }
    public void setTurbos(boolean t)
    {
        turbos = t;
    }
    public int getNumDoors() 
    {
        return numDoors;
    }
    public void setNumDoors(int d)
    {
        numDoors = d;
    }
     public String toString()
    {
        return  super.toString() + " \nDoors: " + numDoors + " \nHas turbos: " + (turbos? "yes":"no");
    }
    /**
     * please note: the above operator (turbos? "yes":"no") is a ternary.
     * we may not have learned about these in class, but it is a nice thing that Logan decided to include
     * what it does is ask "does turbos equal true?" 
     * if it does, then it prints "yes" if not, then it prints "no"
     * ( ps: Logan typed this paragraph)
     * ( pps: good job logan )
     * ( ppps: thanks logan )
     * ( pppps: no problem logan )
     */ 
    }