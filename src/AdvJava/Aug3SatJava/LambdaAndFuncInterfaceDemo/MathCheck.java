package AdvJava.Aug3SatJava.LambdaAndFuncInterfaceDemo;

import java.util.function.Predicate;

public class MathCheck {

    public void mathCheck(int newNumber, IEvenChecker evenChecker){

        if (evenChecker.evenOddChecker(newNumber)){
            System.out.println(newNumber+" is even.");
        }else {
            System.out.println(newNumber+" is odd.");
        }
    }


    static void newMathCheck(int newNumber, Predicate<Integer> evenChecker){

        if (evenChecker.test(newNumber)){
            System.out.println(newNumber+" is even.");
        }else {
            System.out.println(newNumber+" is odd.");
        }
    }
}
