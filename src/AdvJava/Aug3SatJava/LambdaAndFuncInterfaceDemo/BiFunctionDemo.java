package AdvJava.Aug3SatJava.LambdaAndFuncInterfaceDemo;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Double, Double> calculatePrice = (a, b) -> (a * b);

        System.out.println(calculatePrice.apply(5, 5.5));
    }
}
