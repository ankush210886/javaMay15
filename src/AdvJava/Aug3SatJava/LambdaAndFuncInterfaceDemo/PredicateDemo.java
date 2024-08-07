package AdvJava.Aug3SatJava.LambdaAndFuncInterfaceDemo;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        //Creating a predicate
        Predicate<Integer> lessThan = i -> (i < 18);

        //Calling a predicate method
        System.out.println("Enter a number to check if it is greater or smaller than 18: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean check = lessThan.test(num);
        if (check == true)
            System.out.println(check +". "+ num + " is smaller than 18.");
        else
            System.out.println(check +". "+ num + " is equal or greater than 18.");
    }
}
