public class CarFactoryMain {
    public static void main(String[] args) {


        Car car1 = CarFactory.createCar();
        Car car2 = CarFactory.createCar();

        System.out.println("Number of created cars: " + Car.getCarsNumber());
    }
}
