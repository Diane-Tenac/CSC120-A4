import java.util.ArrayList;

public class Car implements CarRequirements {

    int maxCapacity;
    ArrayList<Passenger> passengersOnboard;

    /* Constructor 
    * @param maxCapacity
    */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(); 
    }

    /* Accessor to get the capacity
    * @return maxCapacity
     */
    public int getCapacity() {
        return this.maxCapacity;
    }
    /* Manipulator to set the capacity
    * @param maxCapacity
     */
    public void setCapacity(int maxCapacity){ 
        this.maxCapacity = maxCapacity;
    }

    /* Method to calculate the remaining seats
    * @return seatsRemaining=getCapacity() - passengersOnboard.size() 
    */
    public int seatsRemaining() {
        return getCapacity() - passengersOnboard.size();
    }
    /* Methods to add passengers
    * @param passeger-object
    * @return true if passenger is added and false if otherwise
     */
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
    /* Methods to remove passengers
    * @param passeger-object
    * @return true if passenger is removed and false if otherwise
     */
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
    /* Method to print the passengers in the train
     */
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