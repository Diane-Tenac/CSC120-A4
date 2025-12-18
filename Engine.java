public class Engine implements EngineRequirements {

    private FuelType fuelType;
    private double maxFuel;
    private double currentFuel;

    /* Constructor */
    public Engine(FuelType fuelType, double maxFuel, double currentFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    }

    /* Accessors - FIXED */
    public FuelType getFuelType() { 
        return this.fuelType;  
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType; 
    }

    public double getMaxFuel() {  
        return this.maxFuel;  
    }

    public void setMaxFuel(double maxFuel) { 
        this.maxFuel = maxFuel;
    }

    public double getCurrentFuel() { 
        return this.currentFuel;  
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    /* Methods */
    public void refuel() {
        this.currentFuel = this.maxFuel; 
        System.out.println("Refueled! Current fuel: " + this.currentFuel);
    }

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