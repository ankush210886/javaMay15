package AdvJava.July20AdJavaSatSETs;

import java.util.*;
import java.util.Map;

public class LicensePlateMapper {
    public static void main(String[] args) {
        Map<String, String> licensePlate = new HashMap<>();

        licensePlate.put("A0001","CYYC100");
        licensePlate.put("A0002","CYYC200");
        licensePlate.put("A0003","CYYC300");
        licensePlate.put("A0004","CYYC400");
        licensePlate.put("A0005","CYYC500");

        System.out.println("\nLicense details are:"+licensePlate);

        Set<String> keys = licensePlate.keySet();
        System.out.println("\nAll keys in the map are: "+keys);

        Collection<String> values = licensePlate.values();
        System.out.println("\nSet of values in the map: "+values);
        System.out.println("\nEnteries before updation.");

        Set<Map.Entry<String, String>> entrySet = licensePlate.entrySet();

        for(String key : keys){
            licensePlate.put(key, "AAA111");
        }

        System.out.println("All updated values are: "+licensePlate.keySet());

        licensePlate.putIfAbsent("H12345678", "XYZ999");

        System.out.println("\nAdd H12345678, XYZ999, if not already present:");
        System.out.println(licensePlate);
    }
}
