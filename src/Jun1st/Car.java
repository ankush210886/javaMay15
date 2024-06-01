package Jun1st;

public class Car {

    // properties

    String colour;
    String brand;
    int engineSize;

    void brake(){
        System.out.println("Brakes...");
    }

    void run(){
        System.out.println("Running...");
    }

    boolean hasElectricEngine(){
        return true;
    }
}

