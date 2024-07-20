package July13JavaSat;

import java.util.*;
import java.lang.*;


public class RemoveDuplicatesList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> treeSet = new TreeSet();
        
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(23);
        list.add(34);
        list.add(23);
        list.add(54);
        list.add(54);
        list.add(32);
        list.add(54312);
        list.add(4353);
        list.add(43);

        System.out.println("Original list: "+list);
        Set<Integer> set = new HashSet();

        set.addAll(list);
        System.out.println("List converted to Set and duplicate elements removed: "+set);
        set.add(50);
        set.remove(50);
        boolean empty = set.isEmpty();
        System.out.println("Is this Set empty?: "+empty);
        Iterator<Integer> iterator = set.iterator();
        boolean present = set.contains(30);
        System.out.println("Check if 30 is a part of the list: "+present);
        treeSet.addAll(set);
        System.out.println("TreeSet elements: "+treeSet);
        boolean equalList = treeSet.equals(set);
        System.out.println("check if set and treeSet have equal elements: "+equalList);
        set.add(50);
        System.out.println("adding element '50' " +set);

    }
}
