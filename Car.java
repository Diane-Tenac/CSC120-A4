import java.util.ArrayList;

public class Car {

    int maxCapacity;
    ArrayList<Passenger> passengersOnboard;

    /* Constructor */
    public Car(int maxCapacity){
        this.maxCapacity=maxCapacity;
        this.passengersOnboard=new ArrayList<>(10);
    }

    ;
    /* Accessors */
    public int getCapacity() {
        return maxCapacity;
    }
    public void setCapacity(){
        this.maxCapacity = maxCapacity;

    }

    /* Methods */
    public int seatsRemaining() {
        return maxCapacity-passengersOnboard.size();
        
    }

    public Boolean addPassenger(Passenger p) {
        int remainingSeats = this.seatsRemaining();
        if (remainingSeats>0){
            passengersOnboard.add(p);
            return true;

        }
        return false;

    }

    public Boolean removePassenger(Passenger p) {
        if (passengersOnboard.size()>0){
            passengersOnboard.remove(p);
            return true;

        }
        return false;
    }



    public void printManifest() {
        for (int i=0; i<passengersOnboard.size(); i++) {
            if (passengersOnboard.size() >0){
                System.out.println(passengersOnboard.get(i));

            }
            else{
                System.out.println("This car is EMPTY.");
            }

            


        }
        

    }

}
