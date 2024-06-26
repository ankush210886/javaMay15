package June22ndJavaSat.VehicleInheritence;

import java.util.Scanner;

public class ElectricCars extends Car {
    private int batteryCapacity;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    void chargeBattery(){
        System.out.println("Whats the battery capacity?");
        Scanner scan = new Scanner(System.in);
        batteryCapacity = scan.nextInt();
        System.out.println("Solid Battery boss: "+batteryCapacity);
    }
}
