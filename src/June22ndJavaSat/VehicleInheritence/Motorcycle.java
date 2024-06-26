package June22ndJavaSat.VehicleInheritence;

import java.util.Scanner;

public class Motorcycle extends Vehicle {
    private int numCylinders;

    public int getNumCylinders(){
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders){
        this.numCylinders = numCylinders;
    }

    public void cylinders(){
        System.out.println("How many cylinders does your bike have, '3', '4' or '6'?");
        Scanner scan = new Scanner(System.in);
        numCylinders = scan.nextInt();
        System.out.println("Holly Molly!!! "+numCylinders);
    }

}
