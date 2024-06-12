package Assignment3;

import java.util.*;

public class Book {

    String title, author; // instance variables
    static double price;
    static int qty;

    public Book(String title, String author, double price, int qty) { //declare

        this.title = title; // initialize
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public static void userInput(){
        System.out.println("Enter the name of the book");
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();

        System.out.println("Enter the name of the author");
        String author = scan.nextLine();

        System.out.println("Enter the price");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int qty = scan.nextInt();

    }

    public static void totalCost(){
        System.out.println(this.qty * this.price);

    }

}

