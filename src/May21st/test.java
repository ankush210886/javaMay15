package May21st;

import java.util.Scanner;

public class test {
    public static void main(String[] strgs){

        //Scanner - user input

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1=scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2=scanner.nextInt();

        int sum =num1+num2;
        System.out.println("The Sum of "+num1+" & "+num2+" is "+sum);

    }
}
