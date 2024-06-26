package June22ndJavaSat.VehicleInheritence;

import java.util.Scanner;

public class Car extends Vehicle {
    private int numDoors;

    public int getNumDoors(){
        return numDoors;
    }

    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }

    public void doors(){
        System.out.println("nice car!\n");
        System.out.println("How many doors your car have, '2' or '4'?");
        Scanner scan = new Scanner(System.in);
        numDoors = scan.nextInt();
        System.out.println("wow, sounds like one hell of a car with that many doors "+numDoors);
    }


}
