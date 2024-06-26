package June22ndJavaSat.VehicleInheritence;

public class VehicleMain {
    public static void main(String[] args) {

        Car car = new Car();
        Motorcycle bike = new Motorcycle();
        ElectricCars ev = new ElectricCars();

        System.out.println("Tell me about your car?");
        car.getMake();
        car.getModel();
        car.getYear();
        car.start();
        car.stop();
        car.displayInfo();
        car.doors();

        System.out.println("Turn to showcase your bike now!");
        bike.getMake();
        bike.getModel();
        bike.getYear();
        bike.start();
        bike.stop();
        bike.displayInfo();
        bike.cylinders();

        System.out.println("Do you have any EVs, if yes then");
        ev.getMake();
        ev.getModel();
        ev.getYear();
        ev.start();
        ev.stop();
        ev.displayInfo();
        ev.chargeBattery();

    }
}
