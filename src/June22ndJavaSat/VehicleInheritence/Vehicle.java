package June22ndJavaSat.VehicleInheritence;

import java.util.Scanner;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start(){

        System.out.println("Push start button to start!");
    }

    public void stop(){
        System.out.println("Push stop button to stop!");
    }

    public void displayInfo(){
       System.out.println("Pls enter the make:");
       Scanner scan = new Scanner(System.in);
       make = scan.nextLine();
       System.out.println("Pls enter the model:");
       model = scan.nextLine();
       System.out.println("Pls enter the year:");
       year = scan.nextInt();

        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }

}
