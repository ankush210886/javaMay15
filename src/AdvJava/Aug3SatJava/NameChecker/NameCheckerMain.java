package AdvJava.Aug3SatJava.NameChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NameCheckerMain {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ank", "Bavneet", "Navjot", "Divyesh", "Pranshi"));

        Predicate<String> nameLen = name -> name.length() >= 4;

        NameChecker nameChecker = new NameChecker();
        //nameChecker.checkName("Bavneet", name -> name.length()>=4); reference

        for (String n : names){
            nameChecker.checkName(n, name -> name.length()>=4);
        }


    }
}
