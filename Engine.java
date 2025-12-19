/* Engine class controlling the tarain engine and its fuel usability
 */
public class Engine implements EngineRequirements {

    private FuelType fuelType;
    private double maxFuel;
    private double currentFuel;

    /* Constructor 
    * @param fuelType - type of fuel the engine uses
    * @param maxFuel - maximum fuel capacity of the engine
    * @param currentFuel - current fuel level of the engine
    */
    public Engine(FuelType fuelType, double maxFuel, double currentFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    }

    /* Accessors helping in getting access to the fuelType
    * @return fuelType
    */
    public FuelType getFuelType() { 
        return this.fuelType;  
    }
    /* manipulator to update fuelType
    * @param fuelType
    */

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType; 
    }
    /* Accessor to access the maxFuel
    * @return fuelType
    */
    public double getMaxFuel() {  
        return this.maxFuel;  
    }
    /* manipulator to update the maximum fuel level
    * @param fuelType
    */
    public void setMaxFuel(double maxFuel) { 
        this.maxFuel = maxFuel;
    }
    /* Accessor to access the currentFuel
    * @return currentFuel
    */
    public double getCurrentFuel() { 
        return this.currentFuel;  
    }
    /* manipulator to update the current fuel level
    * @param currentFuel
    */
    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    /* Method to set the current fuel
    */
    public void refuel() {
        this.currentFuel = this.maxFuel; 
        System.out.println("Refueled! Current fuel: " + this.currentFuel);
    }

    /* Method to coordinate the engine movement
    * @return true if fuel is enough to run the engine
    */

    public Boolean go() {
        if (this.currentFuel > 0) {
            this.currentFuel -= 2.0;  
            System.out.println("Engine running... Remaining fuel: " + this.currentFuel);
            return true;
        } else {
            System.out.println("No fuel left. The engine has stopped.");
            return false;
        }
    }

    // Main method
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100.0); 
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}