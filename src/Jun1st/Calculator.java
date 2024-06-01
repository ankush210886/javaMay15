package Jun1st;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("Welcome to my calculator");
        System.out.println("************************");

        System.out.println("1. Press 1 for Addition");
        System.out.println("2. Press 2 for Subtraction");
        System.out.println("3. Press 3 for Division");
        System.out.println("4. Press 4 for Multiplication");
        System.out.println("5. Press 5 for Remainder");
        System.out.println("6. Press 5 to Exit");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        CalculatorMethods method = new CalculatorMethods();

        switch (input) {

            case 1:
                method.sum();
                break;

            case 2:
                method.subtract();
                break;

            case 3:
                method.division();
                break;

            case 4:
                method.multiply();
                break;

            case 5:
                method.remainder();
                break;

            default:
                System.out.println("Exited...");


        }
    }
}
