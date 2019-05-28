import java.util.Scanner;

public class CarFactory {
    private static Scanner scanner = new Scanner(System.in);

    static Car createCar(){
        Car car = new Car();
        System.out.println("Enter car name: ");
        car.setName(scanner.nextLine());
        System.out.println("Enter fuel consumption: ");
        car.setFuelConsumption(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter speed limit: ");
        car.setSpeedLimit(scanner.nextInt());
        scanner.nextLine();
        return car;
    }

//drugi sposób

    static Car createCar1(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car name: ");
        String name= scanner.nextLine();
        System.out.println("Enter fuel consumption: ");
        int fuel = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter speed limit: ");
        int speed = scanner.nextInt();

        return new Car(name,fuel,speed);
    }

}
