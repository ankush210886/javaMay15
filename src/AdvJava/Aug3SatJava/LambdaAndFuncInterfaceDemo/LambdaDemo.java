package AdvJava.Aug3SatJava.LambdaAndFuncInterfaceDemo;

import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        IEvenChecker checkEven = num -> num % 2 == 0;

        int number = 57;
        if (checkEven.evenOddChecker(number))
            System.out.println("No is even.");
        else
            System.out.println("No is odd.");


        MathCheck check = new MathCheck();
        check.newMathCheck(34, num -> num % 2 == 0);
    }
}