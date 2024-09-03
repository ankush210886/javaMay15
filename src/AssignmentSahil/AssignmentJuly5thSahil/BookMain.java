package AssignmentSahil.AssignmentJuly5thSahil;

public class BookMain {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore("The Java Book Store");

        //Add sample books

        bookStore.addBook(new Book("Effective Java", "Joshua Bloch", 45.00, 10));
        bookStore.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", 55.00, 5));


        //List all the books
        System.out.println("Books available in the store:");
        bookStore.listBooks();

        //Simulate purchaseing books
        System.out.println("\nPurchasing books");
        bookStore.purchaseBooks("Effective Java", 10, true);
        bookStore.purchaseBooks("Java: The Complete Reference",5,false);
    }
}
