public class Car {

    String make;
    int fuelLevel;
    boolean isRunning;

    public Car(String make, int fuelLevel) {
        this.make = make;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }

    public void startCar() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println(make + " is running...");
        } else {
            System.out.println("Cannot start " + make + ": not enough fuel!");
        }
    }

}
