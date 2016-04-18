
/**
 * Logan Stucki
 */
public class vehicleTest {
    public static void main() {
        Car sCarGo = new Car("Chevy", "blue", 300.1, 1, false);
        System.out.println("\nCar test: " + sCarGo.toString());
        sCarGo = new Car();
        System.out.println("\nCar test: " + sCarGo.toString());
        sCarGo = new Car("BrandX");
        System.out.println("\nCar test: " + sCarGo.toString());
        sCarGo = new Car("BrandY", "green");
        System.out.println("\nCar test: " + sCarGo.toString());
        sCarGo = new Car("BrandZ","yellow",400.2);
        System.out.println("\nCar test: " + sCarGo.toString());
        sCarGo = new Car("BrandA","purple",532.6,3);
        System.out.println("\nCar test: " + sCarGo.toString());
        
        sCarGo.setBrand("Ford");
        System.out.println(sCarGo.getBrand());
        sCarGo.setColor("brown");
        System.out.println(sCarGo.getColor());
        sCarGo.setHP(267.5);
        System.out.println(sCarGo.getHP());
        sCarGo.setNumDoors(4);
        System.out.println(sCarGo.getNumDoors());
        sCarGo.setTurbos(true);
        System.out.println((sCarGo.getTurbos()? "yes":"no"));
        
        MotorizedVehicle ugh = new MotorizedVehicle("Ferrari", "red", 9001.0); // over 9000 hp
        System.out.println("\nmotorizezdVehicle test: " + ugh.toString());
        //all the motorizedVehicle and Vehicle constructors and methods are called previously
        Vehicle wow = new Vehicle("brand123","blue");
        System.out.println("\nVehicle test: " + wow.toString());
        
        // now for a nomotor vehicle test!
        NoMotor randomVehicle = new NoMotor("Ally", "green", "water");
        System.out.println("\nnoMotor test:" + randomVehicle.toString());
        randomVehicle.setModeOfPower("sewer");
        System.out.println(randomVehicle.getModeOfPower());
    }
}
/**
 * Output:
 * 
 * 
 * Car test: 
 * Vechicle Color: blue
 * Vehicle Brand: Chevy 
 * Horsepower: 300.1 
 * Doors: 1 
 * Has turbos: no
 * 
 * Car test: 
 * Vechicle Color: red
 * Vehicle Brand: generic brand 
 * Horsepower: 0.0 
 * Doors: 0 
 * Has turbos: yes
 * 
 * Car test: 
 * Vechicle Color: red
 * Vehicle Brand: BrandX 
 * Horsepower: 0.0 
 * Doors: 0 
 * Has turbos: yes
 * 
 * Car test: 
 * Vechicle Color: green
 * Vehicle Brand: BrandY 
 * Horsepower: 0.0 
 * Doors: 0 
 * Has turbos: yes
 * 
 * Car test: 
 * Vechicle Color: yellow
 * Vehicle Brand: BrandZ 
 * Horsepower: 400.2 
 * Doors: 0 
 * Has turbos: yes
 * 
 * Car test: 
 * Vechicle Color: purple
 * Vehicle Brand: BrandA 
 * Horsepower: 532.6 
 * Doors: 3 
 * Has turbos: yes
 * Ford
 * brown
 * 267.5
 * 4
 * yes
 * 
 * motorizezdVehicle test: 
 * Vechicle Color: red
 * Vehicle Brand: Ferrari 
 * Horsepower: 9001.0
 * 
 * Vehicle test: 
 * Vechicle Color: blue
 * Vehicle Brand: brand123
 * 
 * noMotor test:
 * Vechicle Color: green
 * Vehicle Brand: Ally
 * Mode Of Power: water
 * sewer
 *
 */