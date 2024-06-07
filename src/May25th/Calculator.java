package May25th;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("Welcome to my calculator");
        System.out.println("************************");

        System.out.println("Enter 2 numbers");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("1. Press 1 for Addition");
        System.out.println("2. Press 2 for Subtraction");
        System.out.println("3. Press 3 for Division");
        System.out.println("4. Press 4 for Multiplication");
        System.out.println("5. Press 5 for Remainder");
        System.out.println("6. Press 5 to Exit");

        int input = scan.nextInt();

        switch (input) {

            case 1:
                double sum;
                sum=num1+num2;
                System.out.println("Sum of "+num1+" & "+num2+" is "+sum);
                break;

            case 2:
                double diff = num1 - num2;
                System.out.println("Difference of "+num1+" & "+num2+" is "+diff);
                break;

            case 3:
                double div;
                div=num1/num2;
                System.out.println("Divison of "+num1+" & "+num2+" is "+div);
                break;

            case 4:
                double mul;
                mul = num1 * num2;
                System.out.println("Multiplication of "+num1+" & "+num2+" is "+mul);
                break;

            case 5:
                double rem;
                rem = num1 % num2;
                System.out.println("Remainder of "+num1+" & "+num2+" is "+rem);
                break;

            default:
                System.out.println("Exited...");


        }
    }
}
