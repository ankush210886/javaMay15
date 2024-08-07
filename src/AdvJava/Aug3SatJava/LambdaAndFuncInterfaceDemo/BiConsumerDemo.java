package AdvJava.Aug3SatJava.LambdaAndFuncInterfaceDemo;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        //Creating a BiConsumer
        BiConsumer<String, Integer> print = (s, i) -> System.out.println(s + " " + i);

        //Calling a BiConsumer method
        print.accept("Age is: ", 30);
        print.accept("Age is: ", 20);
        print.accept("Age is: ", 10);
    }
}