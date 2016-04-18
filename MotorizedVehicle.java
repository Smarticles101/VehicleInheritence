// AnthonySibley
public class MotorizedVehicle extends Vehicle
{
    double horsePower ;
    
    public MotorizedVehicle()
    {
        super();
        horsePower = 0;
        
    }
    public MotorizedVehicle(String brand) 
    {
        super(brand);
        horsePower = 0;
    }
    public MotorizedVehicle(String brand, String color)
    {
        super(brand, color);
        horsePower = 0;
    }
    public MotorizedVehicle(String brand, String color, double power)
    {
        super(brand, color);
        horsePower = power;
    }
     public void setHP(double hp)
    {
        horsePower = hp;
    }
    public double getHP()
    {
      return horsePower;
    }
    public String toString()
    {
        return super.toString() + " \nHorsepower: " + horsePower;
    }
}
