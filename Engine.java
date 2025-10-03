
public class Engine {

    private FuelType fuelType;
    private double maxFuel;
    private double currentFuel;

    /* The constructor */
    public Engine(FuelType fuel_type, double maxFuel, double currentFuel) {
        this.fuelType = fuel_type;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    }

    /* Accessors */
    public FuelType getFuelType(FuelType fuel_type) {
        return fuel_type;
    }

    public void setFuelType(FuelType fuel_type) {
        this.fuelType = fuelType;

    }

    public double getMaxfuel(double maxFuel) {

        return maxFuel;
    }

    public void setMaxfuel(double maxFuel) {

        this.maxFuel = maxFuel;
    }

    public double getCurrentFuel(double currentFuel) {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    /*methods */
    public void refuel() {
        double currentFuel = maxFuel;

    }

    public Boolean go() {
        if (currentFuel > 0) {
            // use some fuel each time the engine goes
            currentFuel -= 1.0; // you can adjust how fast fuel burns
            System.out.println("Engine running... Remaining fuel: " + currentFuel);
            return true;
        } else {
            System.out.println("No fuel left. The engine has stopped.");
            return false;
        }
    }
        

    }


