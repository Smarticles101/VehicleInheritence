// this is vehicle.java
// Logan Stucki
public class Vehicle {
  public String vehicleBrand;
  public String vehicleColor;
  
  public Vehicle () {
    vehicleBrand = "generic brand";
    vehicleColor = "red";
  }
  
  public Vehicle(String brand) {
    vehicleBrand = brand;
    vehicleColor = "red";
  }
  
  public Vehicle(String brand, String color) {
    vehicleBrand = brand;
    vehicleColor = color;
  }

  public void setBrand(String brand) {
    vehicleBrand = brand;
  }

  public String getBrand() {
    return vehicleBrand;
  }
  
  public void setColor(String color) {
    vehicleColor = color;
  }
  
  public String getColor() {
    return vehicleColor;
  }
    
  public String toString() {
    return "\nVechicle Color: " + vehicleColor + "\nVehicle Brand: " + vehicleBrand;
  }
}