package AdvJava.Aug3SatJava.NameChecker;
import java.util.*;

public class NameEnhancerMain {
    public static void main(String[] args) {

        INameEnhancer iNameEnhancer = name -> name.concat(name);
        Enhance nameEnhance = new Enhance();
        System.out.println(nameEnhance.enhance("Ankush", iNameEnhancer));
        //OR
        System.out.println(nameEnhance.enhance("Ankush", name -> name.concat(name)));

    }
}