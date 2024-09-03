package AssignmentSahil.AssignmentJuly5thSahil;

import java.util.*;

public class BookStore {
    private String name;
    private List<Book> books;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void listBooks(){
        for (Book book : books){
            System.out.println("Title: "+book.getTitle() +
                                ", Author: "+book.getAuthor() +
                                ", Price: "+book.getPrice() +
                                ", Stock: "+book.getStock());
        }
    }
    public void purchaseBooks(String title, int quantity, boolean isMember){

        for(Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                try {
                    double price = book.getPrice();
                    if (isMember){
                        MemberDiscount discount = new MemberDiscount();
                        price = discount.applyDiscount(price);
                    }
                    book.sellBook(quantity);
                    System.out.println("Purchased "+quantity+" copies of "+title+" for $"+price * quantity);
                } catch (InsufficientStockException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Book not available: "+title);
    }
}