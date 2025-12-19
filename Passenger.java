/*
* Passenger class that controlls who gets in and/or off the car
 */

public class Passenger implements PassengerRequirements{

    public String name;

    /* constractor
    * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }
    /* Accessor to get the name
    * @return name
     */
    public String getName(){
        return name;
    }

    /*method to check if the car is not full 
    * @param car-object
    */
    // checking if the car is full
    public void boardCar(Car c) {
        if (c.addPassenger(this)==false){
            System.out.println("The car is full");
        }
    }
    /* Method to control who gets off teh car
    * @param car-object
     */
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
