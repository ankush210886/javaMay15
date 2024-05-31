package May25th;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int side1,side2,side3;
        System.out.println("Enter side 1 of triangle:");
        side1=sc.nextInt();
        System.out.println("Enter side 2 of triangle:");
        side2=sc.nextInt();
        System.out.println("Enter side 3 of triangle:");
        side3=sc.nextInt();

        if (side1==side2 && side2==side3 && side1==side3){
            System.out.println("The triangle is Equilateral");
        }
        else if (side1==side2 || side2==side3 || side1==side3){
            System.out.println("The triangle is Isosceles");
        }
        else{
            System.out.println("The traingle is Scalene");
        }


    }
}
