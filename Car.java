import java.util.ArrayList;

public class Car implements CarRequirements {

    int maxCapacity;
    ArrayList<Passenger> passengersOnboard;

    /* Constructor */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(); 
    }

    /* Accessors */
    public int getCapacity() {
        return this.maxCapacity;
    }
    
    public void setCapacity(int maxCapacity){ 
        this.maxCapacity = maxCapacity;
    }

    /* Methods */
    public int seatsRemaining() {
        return getCapacity() - passengersOnboard.size();
    }

    public Boolean addPassenger(Passenger p) {
        int remainingSeats = this.seatsRemaining();
        if (remainingSeats > 0) {
            if (!this.passengersOnboard.contains(p)) {
                passengersOnboard.add(p);
                return true;
            } else {
                System.out.println("Passenger " + p + " is already in this car");
                return false;
            }
        } else {
            System.out.println("There is no available seat");
            return false;
        }
    }

    public Boolean removePassenger(Passenger p) {
        if (passengersOnboard.size() > 0) {
            if (passengersOnboard.contains(p)) {
                passengersOnboard.remove(p);
                return true;
            } else {
                System.out.println("Passenger " + p + " is not in this car");
                return false;
            }
        } else {
            System.out.println("This car is empty");
            return false;
        }
    }

    public void printManifest() {
        if (passengersOnboard.size() > 0) {
            for (int i = 0; i < passengersOnboard.size(); i++) {
                System.out.println(passengersOnboard.get(i));
            }
        } else {
            System.out.println("This car is EMPTY.");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car(10);
        myCar.getCapacity();
        Passenger p1 = new Passenger("Dia");
        Passenger p2 = new Passenger("Ali");

        myCar.addPassenger(p2);
        myCar.addPassenger(p1);
        myCar.printManifest();
    }
}