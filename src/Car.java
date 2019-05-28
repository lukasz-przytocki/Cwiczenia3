public class Car {
    private String name;
    private double fuelConsumption;
    private int speedLimit;

    public static int getCarsNumber() {
        return carsNumber;
    }

    private static int carsNumber=0;

    public Car(String name, double fuelConsumption, int speedLimit) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.speedLimit = speedLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public Car(){
        carsNumber+=1;
    }
}
