
public class Passenger implements PassengerRequirements{

    public String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    /*methods */
    // checking if the car is full
    public void boardCar(Car c) {
        if (c.addPassenger(this)==false){
            System.out.println("The car is full");
        }
    }

    public void getOffCar(Car c) {
        if(c.removePassenger(this)==false){
            System.out.println(" Check in another car");
        }
    }
    public static void main(String[] args) {
        Passenger p2=new Passenger("Anne");
        Passenger p3=new Passenger("Lyne");
    }
}
