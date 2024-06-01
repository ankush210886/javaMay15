package Jun1st;

public class Main {
    public static void main(String[] args) {

        //Objects
        //ClassName refVariable = new ClassName();
        //new -----> create memory
        // stack         ------->           Heap (objects are created)

        Car car = new Car();

        car.run();
        car.brake();
    }
}
