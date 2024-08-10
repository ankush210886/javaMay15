package PracticeAug7FunctionalInterface.ToDoListApp;

import java.util.*;

public class ToDoListMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cont = "y";
        Set<String> set = new HashSet<>();

        System.out.println("***********");
        System.out.println("To Do List");
        System.out.println("***********");
        System.out.println("Press 1 for Adding an item");
        System.out.println("Press 2 for Deleting an item");
        System.out.println("Press 3 for Updating an item");
        System.out.println("Press 4 for Show all items");
        System.out.println("Press 5 for Exit!");
        int input = scanner.nextInt();


        String str = scanner.nextLine();
        set.add(str);

        System.out.println(set);
    }
}