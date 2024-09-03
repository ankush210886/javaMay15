package AdvJava;

import java.util.ArrayList;
import java.util.List;

public class NoX {
    public static void main(String[] args) {
        List<String> listOfStr = new ArrayList<>(List.of("ax", "xb", "cx", "xd", "ex", "fx", "xg", "xxh"));

        listOfStr.replaceAll(str -> str.toLowerCase().replace("x", ""));
        System.out.println(listOfStr);
    }
}
