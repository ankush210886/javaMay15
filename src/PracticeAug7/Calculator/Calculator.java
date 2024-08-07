package PracticeAug7.Calculator;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            System.out.println("***********");
            System.out.println("Calculator");
            System.out.println("***********");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiply");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Exit the calculator");
            int input = scanner.nextInt();

            switch(input){
                case 1:
                    System.out.println("Enter the 2 numbers");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();
                    BiFunction<Double, Double, Double> addition = (x, y) -> x + y;
                    System.out.println("Sum of the 2 numbers is: " +addition.apply(num1, num2));
                    break;
                case 2:
                    System.out.println("Enter the 2 numbers");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    BiFunction<Double, Double, Double> subtraction = (x, y) -> x - y;
                    System.out.println("Difference of the 2 numbers is: " +subtraction.apply(num1, num2));
                    break;
                case 3:
                    System.out.println("Enter the 2 numbers");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    BiFunction<Double, Double, Double> multiply = (x, y) -> x * y;
                    System.out.println("Multiplication of the 2 numbers is: " +multiply.apply(num1, num2));
                    break;
                case 4:
                    System.out.println("Enter the 2 numbers");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    BiFunction<Double, Double, Double> division = (x, y) -> x / y;
                    System.out.println("Division of the 2 numbers is: " +division.apply(num1, num2));
                    break;
                case 5:
                    System.out.println("Exiting....");
                    exit = true;
                    return;
                default:
                    System.out.println("Enter a valid option.");
            }
        }
    }
}
