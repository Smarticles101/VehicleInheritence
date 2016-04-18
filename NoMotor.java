// this is noMotor.java
public class NoMotor extends Vehicle{
  public String power;

  public NoMotor(String brand, String color, String modeOfPower) {
      super(brand, color);
      power = modeOfPower;
  }
  
  public NoMotor() {
    // default mode of power is water
    super();
    power = "water";
  }

  public NoMotor(String brand) {
    super(brand);
    power = "water";
  }
    
  public NoMotor(String brand, String color) {
    super(brand, color);
  }
    
  public String getModeOfPower() {
    return power;
  }
    
  public void setModeOfPower(String modeOfPower) {
    power = modeOfPower;  
  }
  
  public String toString() {
      return super.toString() + "\nMode Of Power: " + power;
  }
}
