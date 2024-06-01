package Jun1st;

import java.util.Scanner;

public class CalculatorMethods {

    Scanner scanner = new Scanner(System.in);

    void sum (){

        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter the second number");
        int b = scanner.nextInt();

        int result = a + b;
        System.out.println("Sum of "+a+" & "+b+" is "+result);
    }

    void subtract (){

        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter the second number");
        int b = scanner.nextInt();

        int result = a - b;
        System.out.println("Subtract of "+a+" & "+b+" is "+result);
    }

    void division (){

        System.out.println("Enter the first number");
        double a = scanner.nextDouble();

        System.out.println("Enter the second number");
        double b = scanner.nextDouble();

        double result = a / b;
        System.out.println("Division of "+a+" & "+b+" is "+result);

        return;

    }

    void multiply (){

        System.out.println("Enter the first number");
        double a = scanner.nextDouble();

        System.out.println("Enter the second number");
        double b = scanner.nextDouble();

        double result = a * b;
        System.out.println("Multiplication of "+a+" & "+b+" is "+result);

        return;

    }


    void remainder (){

        System.out.println("Enter the first number");
        float a = scanner.nextFloat();

        System.out.println("Enter the second number");
        float b = scanner.nextFloat();

        float result = a % b;
        System.out.println("Remainder of "+a+" & "+b+" is "+result);

        return;

    }

}

