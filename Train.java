import java.util.ArrayList;


public class Train implements TrainRequirements {
    // attributes
    private Engine engine;
    private ArrayList<Car> cars;
    private int seatsRemaining;
    private int maxCapacity;


    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity, currentFuelLevel);
        cars = new ArrayList<>(nCars);
        int capacityPerCar = passengerCapacity / nCars;
        for (int i = 0; i < nCars; i++) {
            Car newCar = new Car(capacityPerCar);
            cars.add(newCar);
        }
    }

    // accessors and manipulators
    public Engine getEngine() {
        return this.engine;
    }

    public Car getCar(int i) {
        return cars.get(i);
    }

  
    public int getMaxCapacity() {
        for (Car car : cars) {
            this.maxCapacity += car.getCapacity();
        }
        return this.maxCapacity;
    }


    public int seatsRemaining() {
        this.seatsRemaining = 0;
        for (Car car : cars) {
            this.seatsRemaining += car.seatsRemaining();
        }
        return this.seatsRemaining;
    }

    public void printManifest() {
        System.out.println("Total passengers: ");
        for (int i = 0; i < this.cars.size(); i++) {
            System.out.println();
            System.out.println("* Car " + (i + 1) + " " + "*");
            cars.get(i).printManifest();
        }
    }
}