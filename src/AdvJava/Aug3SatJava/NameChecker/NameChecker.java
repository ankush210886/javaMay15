package AdvJava.Aug3SatJava.NameChecker;

import java.util.function.Predicate;

public class NameChecker {

    public void checkName (String name, Predicate<String> predicateObject){
        if (predicateObject.test(name))
            System.out.println(name+" is approved.");
        else
            System.out.println(name+" is not approved.");
    }
}
