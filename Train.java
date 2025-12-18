import java.util.ArrayList;


public class Train implements TrainRequirements {
    // attributes
    private Engine myEngine;
    private ArrayList<Car> cars;
    private int seatsRemaining;
    private int maxCapacity;
    public int nCars;


    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        this.myEngine = new Engine(fuelType, fuelCapacity, currentFuelLevel);
        this.cars = new ArrayList<>(nCars);
        int capacityPerCar = passengerCapacity / nCars;
        for (int i = 0; i < nCars; i++) {
            Car newCar = new Car(capacityPerCar);
            cars.add(newCar);
        }
    }

    // accessors and manipulators
    public Engine getEngine() {
        return this.myEngine;
    }

    public Car getCar(int i) {
        return this.cars.get(i);
    }

  
    public int getMaxCapacity() {
        for (Car car : cars) {
            this.maxCapacity += car.getCapacity();
        }
        return this.maxCapacity;
    }


    public int seatsRemaining() {
        int seatsRemaining = 0;
        for (Car car : this.cars) {
            seatsRemaining += car.seatsRemaining();
        }
        return seatsRemaining;
    }

    public void printManifest() {
        System.out.println("Total passengers: ");
        for (Car car : cars) {
            car.printManifest();
        }
    }
    public static void main(String[] args) {
        Train myTrain=new Train(FuelType.ELECTRIC, 100.0,100.0, 8, 5);
        Car car1=new Car(1);
        myTrain.cars.add(car1);
        Passenger p=new Passenger("Mike");
        car1.addPassenger(p);
        myTrain.printManifest();

    }
}