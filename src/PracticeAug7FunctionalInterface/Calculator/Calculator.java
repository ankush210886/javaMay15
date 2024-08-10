package PracticeAug7FunctionalInterface.Calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculator {

    private static double[] getNumbers(Scanner scanner){
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        return new double[]{num1, num2};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        Map<Integer, BiFunction<Double, Double, Double>> operations = new HashMap<>();
        operations.put(1, (x, y) -> x + y);
        operations.put(2, (x, y) -> x - y);
        operations.put(3, (x, y) -> x * y);
        operations.put(4, (x, y) -> x / y);

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

            if (input == 5){
                System.out.println("Exiting....");
                exit = true;
            } else if (operations.containsKey(input)){
                double[] numbers = getNumbers(scanner);
                double num1 = numbers[0];
                double num2 = numbers[1];
                BiFunction<Double, Double, Double> operation = operations.get(input);
                System.out.println("Result is: " + operation.apply(num1, num2));
            }else {
                System.out.println("Enter a valid number between 1 - 5");
            }
        }
    }
}

/*
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
 */