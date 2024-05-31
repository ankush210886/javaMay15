package May25th;

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

        switch (input) {

            case 1:
                System.out.println("Enter 2 numbers");
                double x,y,sum;
                x=sc.nextInt();
                y=sc.nextInt();
                sum=x+y;
                System.out.println("Sum of "+x+" & "+y+" is "+sum);
                break;

            case 2:
                System.out.println("Enter 2 numbers");
                x=sc.nextInt();
                y=sc.nextInt();
                double diff=x-y;
                System.out.println("Difference of "+x+" & "+y+" is "+diff);
                break;

            case 3:
                System.out.println("Enter 2 numbers");
                double div;
                x=sc.nextInt();
                y=sc.nextInt();
                div=x/y;
                System.out.println("Divison of "+x+" & "+y+" is "+div);
                break;

            case 4:
                System.out.println("Enter 2 numbers");
                double mul;
                x=sc.nextInt();
                y=sc.nextInt();
                mul=x*y;
                System.out.println("Multiplication of "+x+" & "+y+" is "+mul);
                break;

            case 5:
                System.out.println("Enter 2 numbers");
                double rem;
                x=sc.nextInt();
                y=sc.nextInt();
                rem=x%y;
                System.out.println("Remainder of "+x+" & "+y+" is "+rem);
                break;

            default:
                System.out.println("Exited...");


        }
    }
}
