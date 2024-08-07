package AdvJava.Aug3SatJava.LambdaAndFuncInterfaceDemo;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //creating a Function
        Function<Integer, String> intToString = i -> "Number: " + i;

        System.out.println("Enter the number you want to convert to string: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(intToString.apply(num));
    }
}
